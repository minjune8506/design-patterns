package structural.decorator.example.coffee;

import java.math.BigDecimal;

public class ChocolateDecorator extends CoffeeDecorator {

    private final BigDecimal PRICE = BigDecimal.valueOf(400L);
    private final String DESCRIPTION = " with chocolate";


    protected ChocolateDecorator(Coffee coffee) {
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
