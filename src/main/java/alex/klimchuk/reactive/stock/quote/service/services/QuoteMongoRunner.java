package alex.klimchuk.reactive.stock.quote.service.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class QuoteMongoRunner implements CommandLineRunner {

    private final QuoteGeneratorService quoteGeneratorService;
    private final QuoteHistoryService quoteHistoryService;

    @Override
    public void run(String... args) throws Exception {
        quoteGeneratorService.fetchQuoteStream(Duration.ofMillis(100L))
                .take(100L)
                .log("Got Quote:")
                .flatMap(quoteHistoryService::saveQuoteToMongo)
                .subscribe(savedQuote -> log.debug("Saved Quote: " + savedQuote),
                        throwable -> log.error("Some Error", throwable),
                        () -> log.debug("All done!!!!!"));
    }

}
