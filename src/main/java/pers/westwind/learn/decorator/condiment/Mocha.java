package pers.westwind.learn.decorator.condiment;

import pers.westwind.learn.decorator.Beverage;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
