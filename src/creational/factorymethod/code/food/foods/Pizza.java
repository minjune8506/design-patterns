package behavioral.factorymethod.code.food.foods;

import java.math.BigDecimal;

public class Pizza implements Food {

    @Override
    public String getName() {
        return "pizza";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20000);
    }
}
