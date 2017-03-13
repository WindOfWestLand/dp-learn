package pers.westwind.learn.factory;

import pers.westwind.learn.factory.pizza.Pizza;

/**
 * Created by Administrator on 2017/3/13.
 */
public class NormalPizzaStore extends PizzaStore {
    private SimplePizzaFactory factory;

    public NormalPizzaStore() {
        factory = new SimplePizzaFactory();
    }

    protected Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
