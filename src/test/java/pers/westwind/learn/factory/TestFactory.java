package pers.westwind.learn.factory;

import org.testng.annotations.Test;
import pers.westwind.learn.factory.pizza.PizzaType;

/**
 * Created by Administrator on 2017/3/13.
 */
public class TestFactory {
    @Test
    public void testSimpleFactory() {
        PizzaStore pizzaStore = new NormalPizzaStore();

        pizzaStore.orderPizza(PizzaType.CHEESE_PIZZA);
        pizzaStore.orderPizza(PizzaType.PEPPERONI_PIZZA);
    }

    @Test
    public void testFactory() {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza(PizzaType.CHEESE_PIZZA);
    }
}
