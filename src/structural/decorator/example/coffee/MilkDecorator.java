package structural.decorator.example.coffee;

import java.math.BigDecimal;

public class MilkDecorator extends CoffeeDecorator {

    private final BigDecimal PRICE = BigDecimal.valueOf(300L);
    private final String DESCRIPTION = " with milk";

    protected MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(PRICE);
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(DESCRIPTION);
    }
}
