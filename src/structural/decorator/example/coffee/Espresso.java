package structural.decorator.example.coffee;

import java.math.BigDecimal;

public class Espresso implements Coffee {

    private final String DESCRIPTION = "espresso";
    private final BigDecimal PRICE = BigDecimal.valueOf(1500L);

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
