package pers.westwind.learn.decorator.condiment;

import pers.westwind.learn.decorator.Beverage;

/**
 * Created by Administrator on 2017/3/12.
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();

    public int getSize() {
        return beverage.getSize();
    }

    public void setSize(int size) {
        beverage.setSize(size);
    }
}
