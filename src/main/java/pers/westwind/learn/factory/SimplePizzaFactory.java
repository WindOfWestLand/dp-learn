package pers.westwind.learn.factory;

import pers.westwind.learn.factory.pizza.*;
import pers.westwind.learn.factory.pizza.ingredient.NYPizzaIngredientFactory;

/**
 * Created by Administrator on 2017/3/13.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals(PizzaType.CHEESE_PIZZA)) {
            pizza = new CheesePizza(new NYPizzaIngredientFactory());
        } else if(type.equals(PizzaType.PEPPERONI_PIZZA)) {
            pizza = new PepperoniPizza();
        } else if(type.equals(PizzaType.CLAM_PIZZA)) {
            pizza = new ClamPizza();
        } else if(type.equals(PizzaType.VEGGIE_PIZZA)) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
