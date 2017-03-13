package pers.westwind.learn.factory;

import pers.westwind.learn.factory.pizza.NYCheesePizza;
import pers.westwind.learn.factory.pizza.Pizza;
import pers.westwind.learn.factory.pizza.PizzaType;

/**
 * Created by Administrator on 2017/3/13.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if(type.equals(PizzaType.CHEESE_PIZZA)) {
            return new NYCheesePizza();
        }
        return null;
    }
}
