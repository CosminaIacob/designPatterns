package factory.pizzaType.chicagoStore;

import factory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public void prepare() {
        System.out.println("prepare ChicagoStyleVeggiePizza");
    }

    public void bake() {
        System.out.println("bake ChicagoStyleVeggiePizza");
    }

    public void cut() {
        System.out.println("cut ChicagoStyleVeggiePizza");
    }

    public void box() {
        System.out.println("box ChicagoStyleVeggiePizza");
    }
}
