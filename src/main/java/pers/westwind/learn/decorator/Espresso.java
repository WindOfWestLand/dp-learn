package pers.westwind.learn.decorator;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
