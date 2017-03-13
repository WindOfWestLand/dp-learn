package pers.westwind.learn.factory.pizza;

/**
 * Created by Administrator on 2017/3/13.
 */
public class PepperoniPizza extends Pizza {
    public void prepare() {
        System.out.println("Prepare PepperoniPizza...");
    }

    public void bake() {
        System.out.println("Bake PepperoniPizza...");
    }

    public void cut() {
        System.out.println("Cut PepperoniPizza...");
    }

    public void box() {
        System.out.println("Box PepperoniPizza...");
    }
}
