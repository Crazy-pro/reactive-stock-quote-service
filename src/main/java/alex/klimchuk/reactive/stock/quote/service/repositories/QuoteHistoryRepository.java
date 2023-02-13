package alex.klimchuk.reactive.stock.quote.service.repositories;

import alex.klimchuk.reactive.stock.quote.service.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface QuoteHistoryRepository extends ReactiveMongoRepository<QuoteHistory, String> {

}
