package pers.westwind.learn.factory.pizza;

import pers.westwind.learn.factory.pizza.ingredient.PizzaIngredientFactory;

/**
 * Created by Administrator on 2017/3/13.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Prepare CheesePizza...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }

    public void bake() {
        System.out.println("Bake Cheese Pizza...");
    }

    public void cut() {
        System.out.println("Cut Cheese Pizza...");
    }

    public void box() {
        System.out.println("Box Cheese Pizza");
    }
}
