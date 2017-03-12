package pers.westwind.learn.decorator;

/**
 * Created by Administrator on 2017/3/12.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
