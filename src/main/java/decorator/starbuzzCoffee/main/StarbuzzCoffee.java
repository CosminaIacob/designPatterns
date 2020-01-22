package decorator.starbuzzCoffee.main;

import decorator.starbuzzCoffee.component.Beverage;
import decorator.starbuzzCoffee.component.Espresso;
import decorator.starbuzzCoffee.component.HouseBlend;
import decorator.starbuzzCoffee.decorators.Mocha;
import decorator.starbuzzCoffee.decorators.Soy;
import decorator.starbuzzCoffee.decorators.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

        Beverage houseBlendSoy = new HouseBlend();
        houseBlendSoy.setSize(Beverage.Size.VENTI);
        houseBlendSoy = new Soy(houseBlendSoy);
        houseBlendSoy = new Mocha(houseBlendSoy);
        houseBlendSoy = new Whip(houseBlendSoy);
        System.out.println(houseBlendSoy.getDescription() + " $" + houseBlendSoy.cost());
    }
}
