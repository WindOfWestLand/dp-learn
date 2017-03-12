package pers.westwind.learn.decorator.condiment;

import pers.westwind.learn.decorator.Beverage;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }



    public double cost() {
        double cost = beverage.cost();
        if(getSize() == Beverage.TALL) {
            cost += .10;
        } else if(getSize() == Beverage.GRANDE) {
            cost += .15;
        } else if(getSize() == Beverage.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
