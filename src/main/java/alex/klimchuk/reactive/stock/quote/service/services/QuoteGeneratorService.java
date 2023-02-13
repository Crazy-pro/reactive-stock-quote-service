package alex.klimchuk.reactive.stock.quote.service.services;

import alex.klimchuk.reactive.stock.quote.service.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);

}
