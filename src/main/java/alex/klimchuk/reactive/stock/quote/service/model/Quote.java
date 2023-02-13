package alex.klimchuk.reactive.stock.quote.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Quote {

    private static final MathContext MATH_CONTEXT = new MathContext(2);

    private String ticker;

    private BigDecimal price;

    private Instant instant;

    public Quote(String ticker, BigDecimal price) {
        this.ticker = ticker;
        this.price = price;
    }

    public Quote(String ticker, Double price) {
        this.ticker = ticker;
        this.price = new BigDecimal(price, MATH_CONTEXT);
    }

}
