package behavioral.factorymethod.code.food.factory;

import behavioral.factorymethod.code.food.foods.Food;
import behavioral.factorymethod.code.food.foods.Hamburger;

public class HamburgerFactory extends FoodFactory {

    @Override
    protected Food createFood() {
        return new Hamburger();
    }
}
