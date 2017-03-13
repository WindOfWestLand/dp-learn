package pers.westwind.learn.factory.pizza;

/**
 * Created by Administrator on 2017/3/13.
 */
public class NYCheesePizza extends Pizza {
    public void prepare() {
        System.out.println("Prepare NewYork Cheese Pizza...");
    }

    public void bake() {
        System.out.println("Bake NewYork Cheese Pizza...");
    }

    public void cut() {
        System.out.println("Cut NewYork Cheese Pizza...");
    }

    public void box() {
        System.out.println("Box NewYork Cheese Pizza");
    }
}
