package decorator.starbuzzCoffee.component;

public class Espresso extends Beverage {

    /**
     * To take care of the description, we set in the constructor for the class.
     * The description instance variable is inherited from Beverage.
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * We don't need to worry about adding in condiments in this class,
     * @return we just need to return the price of an Espresso
     */
    public double cost() {
        return 1.99;
    }
}
