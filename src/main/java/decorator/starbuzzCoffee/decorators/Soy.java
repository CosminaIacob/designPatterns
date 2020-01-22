package decorator.starbuzzCoffee.decorators;

import decorator.starbuzzCoffee.component.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {

        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += .10;
            case GRANDE:
                cost += .15;
            case VENTI:
                cost += .20;
        }
        return cost;
    }
}
