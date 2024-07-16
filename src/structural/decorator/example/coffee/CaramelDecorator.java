package structural.decorator.example.coffee;

import java.math.BigDecimal;

public class CaramelDecorator extends CoffeeDecorator {

    private final BigDecimal PRICE = BigDecimal.valueOf(500L);
    private final String DESCRIPTION = " with caramel";


    protected CaramelDecorator(Coffee coffee) {
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
