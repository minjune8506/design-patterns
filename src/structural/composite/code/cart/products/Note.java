package structural.composite.code.cart.products;

import java.math.BigDecimal;

public class Note implements Product{

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(2000L);
    }
}
