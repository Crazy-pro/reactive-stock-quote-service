package alex.klimchuk.reactive.stock.quote.service.services;

import alex.klimchuk.reactive.stock.quote.service.domain.QuoteHistory;
import alex.klimchuk.reactive.stock.quote.service.model.Quote;
import alex.klimchuk.reactive.stock.quote.service.repositories.QuoteHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Service
@RequiredArgsConstructor
public class QuoteHistoryServiceImpl implements QuoteHistoryService {

    private final QuoteHistoryRepository repository;

    @Override
    public Mono<QuoteHistory> saveQuoteToMongo(Quote quote) {
        return repository.save(QuoteHistory.builder()
                .ticker(quote.getTicker())
                .price(quote.getPrice())
                .instant(quote.getInstant())
                .build());
    }

}
