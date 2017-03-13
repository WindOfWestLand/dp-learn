package pers.westwind.learn.factory.pizza.ingredient;

import pers.westwind.learn.factory.pizza.ingredient.cheese.Cheese;
import pers.westwind.learn.factory.pizza.ingredient.cheese.ReggianoCheese;
import pers.westwind.learn.factory.pizza.ingredient.clams.Clams;
import pers.westwind.learn.factory.pizza.ingredient.clams.FreshClams;
import pers.westwind.learn.factory.pizza.ingredient.dough.Dough;
import pers.westwind.learn.factory.pizza.ingredient.dough.ThinCrustDough;
import pers.westwind.learn.factory.pizza.ingredient.sauce.MarinaraSauce;
import pers.westwind.learn.factory.pizza.ingredient.sauce.Sauce;

/**
 * Created by Administrator on 2017/3/13.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
