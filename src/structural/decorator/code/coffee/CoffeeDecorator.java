package structural.decorator.code.coffee;

import java.math.BigDecimal;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public BigDecimal getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
