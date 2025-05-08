package structural.composite.code.cart.products;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WritingImplementPackage implements Product {

    private final List<Product> products = new ArrayList<>();

    @Override
    public BigDecimal getPrice() {
        var sum = BigDecimal.ZERO;
        for (Product product : products) {
            var price = product.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
