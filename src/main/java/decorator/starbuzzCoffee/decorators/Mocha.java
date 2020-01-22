package decorator.starbuzzCoffee.decorators;

import decorator.starbuzzCoffee.component.Beverage;

/**
 * Mocha is a decorator, so extends CondimentDecorator
 * CondimentDecorator extends Beverage
 */
public class Mocha extends CondimentDecorator {
    /**
     * We're goinf to instantiate Mocha with a reference to a Beverage using:
     * (1) An instance variable to hold the beverage we are wrapping
     */
    Beverage beverage;

    /**
     * (2) A way to set this instance variable to the object we are wrapping.
     * We pass the beverage we're wrapping to the decorator's constructor.
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * We want out description to not only include the beverage -say "House Blend" -
     * but also to include each item decorating the beverage.
     * So first we delegate to the object we are decorating to get its description,
     * then append ", Mocha" to that description
     */
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * Computes the cost of the beverage with the cost of Mocha.
     * First, we delegate the call to the object we are decorating, so that it can compute
     * the cost; then, we add the cost of Mocha to the result.
     */
    public double cost() {
        return beverage.cost() + .20;
    }
}
