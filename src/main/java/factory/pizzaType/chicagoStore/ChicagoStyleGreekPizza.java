package factory.pizzaType.chicagoStore;

import factory.Pizza;

public class ChicagoStyleGreekPizza extends Pizza {

    public void prepare() {
        System.out.println("prepare ChicagoStyleGreekPizza");
    }

    public void bake() {
        System.out.println("bake ChicagoStyleGreekPizza");
    }

    public void cut() {
        System.out.println("cut ChicagoStyleGreekPizza");
    }

    public void box() {
        System.out.println("box ChicagoStyleGreekPizza");
    }
}
