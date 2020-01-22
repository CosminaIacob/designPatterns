package decorator.starbuzzCoffee.decorators;

import decorator.starbuzzCoffee.component.Beverage;

/**
 * The decorator needs to be interchangeable with a Beverage, so we extend Beverage
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
