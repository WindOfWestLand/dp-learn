package pers.westwind.learn.factory.pizza.ingredient;

import pers.westwind.learn.factory.pizza.ingredient.cheese.Cheese;
import pers.westwind.learn.factory.pizza.ingredient.clams.Clams;
import pers.westwind.learn.factory.pizza.ingredient.dough.Dough;
import pers.westwind.learn.factory.pizza.ingredient.sauce.Sauce;

/**
 * Abstract Factory Pattern
 *
 * Created by Administrator on 2017/3/13.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();
}
