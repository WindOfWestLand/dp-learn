package pers.westwind.learn.decorator;

import org.testng.annotations.Test;
import pers.westwind.learn.decorator.condiment.Mocha;
import pers.westwind.learn.decorator.condiment.Soy;
import pers.westwind.learn.decorator.condiment.Whip;

/**
 * Created by Administrator on 2017/3/12.
 */
public class TestDecorator {
    @Test
    public void testSmoke() {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() +
         " $" + espresso.cost());
    }
}
