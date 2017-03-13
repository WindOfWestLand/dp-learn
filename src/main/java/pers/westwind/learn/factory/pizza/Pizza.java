package pers.westwind.learn.factory.pizza;

import pers.westwind.learn.factory.pizza.ingredient.cheese.Cheese;
import pers.westwind.learn.factory.pizza.ingredient.clams.Clams;
import pers.westwind.learn.factory.pizza.ingredient.dough.Dough;
import pers.westwind.learn.factory.pizza.ingredient.sauce.Sauce;

/**
 * Created by Administrator on 2017/3/13.
 */
public abstract class Pizza {
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clams clams;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
