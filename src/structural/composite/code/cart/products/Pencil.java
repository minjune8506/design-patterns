package structural.composite.code.cart.products;

import java.math.BigDecimal;

public class Pencil implements Product {

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(1200L);
    }
}
