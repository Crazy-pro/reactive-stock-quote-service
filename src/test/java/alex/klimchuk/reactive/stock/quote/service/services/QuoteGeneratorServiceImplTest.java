package alex.klimchuk.reactive.stock.quote.service.services;

import alex.klimchuk.reactive.stock.quote.service.model.Quote;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class QuoteGeneratorServiceImplTest {

    QuoteGeneratorService service;

    @BeforeEach
    public void setUp() {
        service = new QuoteGeneratorServiceImpl();
    }

    @Test
    public void testFetchQuoteStream() throws InterruptedException {
        Flux<Quote> quotesFlux = service.fetchQuoteStream(Duration.ofMillis(100L));

        Consumer<Quote> quoteConsumer = System.out::println;
        Consumer<Throwable> throwableConsumer = e -> System.out.println(e.getMessage());

        CountDownLatch countDownLatch = new CountDownLatch(1);
        Runnable done = countDownLatch::countDown;

        quotesFlux.take(30).subscribe(quoteConsumer, throwableConsumer, done);
        countDownLatch.await();
    }

}
