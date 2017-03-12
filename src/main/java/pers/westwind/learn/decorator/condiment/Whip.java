package pers.westwind.learn.decorator.condiment;

import pers.westwind.learn.decorator.Beverage;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .3 + beverage.cost();
    }
}
