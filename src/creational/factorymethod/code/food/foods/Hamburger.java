package behavioral.factorymethod.code.food.foods;

import java.math.BigDecimal;

public class Hamburger implements Food {

    @Override
    public String getName() {
        return "hamburger";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(8000);
    }
}
