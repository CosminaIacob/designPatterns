package factory.pizzaType.nyStore;

import factory.Pizza;

public class NYStyleGreekPizza extends Pizza {

    public void prepare() {
        System.out.println("prepare NYStyleGreekPizza");
    }

    public void bake() {
        System.out.println("bake NYStyleGreekPizza");
    }

    public void cut() {
        System.out.println("cut NYStyleGreekPizza");
    }

    public void box() {
        System.out.println("box NYStyleGreekPizza");
    }
}
