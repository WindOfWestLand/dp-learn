package pers.westwind.learn.factory.pizza;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ClamPizza extends Pizza {
    public void prepare() {
        System.out.println("Prepare ClamPizza...");
    }

    public void bake() {
        System.out.println("Bake ClamPizza...");
    }

    public void cut() {
        System.out.println("Cut ClamPizza...");
    }

    public void box() {
        System.out.println("Box ClamPizza...");
    }
}
