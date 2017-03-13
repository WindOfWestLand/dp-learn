package pers.westwind.learn.factory.pizza;

/**
 * Created by Administrator on 2017/3/13.
 */
public class VeggiePizza extends Pizza {
    public void prepare() {
        System.out.println("Prepare VeggiePizza...");
    }

    public void bake() {
        System.out.println("Bake VeggiePizza...");
    }

    public void cut() {
        System.out.println("Cut VeggiePizza...");
    }

    public void box() {
        System.out.println("Box VeggiePizza...");
    }
}
