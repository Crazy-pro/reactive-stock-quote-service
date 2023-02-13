package alex.klimchuk.reactive.stock.quote.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class QuoteHistory {

    @Id
    private String id;

    private String ticker;

    private BigDecimal price;

    private Instant instant;

}
