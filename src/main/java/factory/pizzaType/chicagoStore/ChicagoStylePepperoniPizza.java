package factory.pizzaType.chicagoStore;

import factory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public void prepare() {
        System.out.println("prepare ChicagoStylePepperoniPizza");
    }

    public void bake() {
        System.out.println("bake ChicagoStylePepperoniPizza");
    }

    public void cut() {
        System.out.println("cut ChicagoStylePepperoniPizza");
    }

    public void box() {
        System.out.println("box ChicagoStylePepperoniPizza");
    }
}
