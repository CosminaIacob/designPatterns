package factory.pizzaType.nyStore;

import factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public void prepare() {
        System.out.println("prepare NYStyleVeggiePizza");
    }

    public void bake() {
        System.out.println("bake NYStyleVeggiePizza");
    }

    public void cut() {
        System.out.println("cut NYStyleVeggiePizza");
    }

    public void box() {
        System.out.println("box NYStyleVeggiePizza");
    }
}
