package factory.pizzaType.nyStore;

import factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public void prepare() {
        System.out.println("prepare NYStylePepperoniPizza");
    }

    public void bake() {
        System.out.println("bake NYStylePepperoniPizza");
    }

    public void cut() {
        System.out.println("cut NYStylePepperoniPizza");
    }

    public void box() {
        System.out.println("box NYStylePepperoniPizza");
    }
}
