package alex.klimchuk.reactive.stock.quote.service.services;

import alex.klimchuk.reactive.stock.quote.service.model.Quote;
import alex.klimchuk.reactive.stock.quote.service.domain.QuoteHistory;
import reactor.core.publisher.Mono;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);

}
