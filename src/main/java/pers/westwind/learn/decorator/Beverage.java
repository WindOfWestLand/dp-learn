package pers.westwind.learn.decorator;

/**
 * Created by Administrator on 2017/3/12.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
