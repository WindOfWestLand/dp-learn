package pers.westwind.learn.factory;

import pers.westwind.learn.factory.pizza.Pizza;

/**
 * Created by Administrator on 2017/3/13.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
