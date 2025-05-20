package behavioral.factorymethod.code.food.factory;

import behavioral.factorymethod.code.food.foods.Food;
import behavioral.factorymethod.code.food.foods.Pizza;

public class PizzaFactory extends FoodFactory {

    @Override
    protected Food createFood() {
        return new Pizza();
    }
}
