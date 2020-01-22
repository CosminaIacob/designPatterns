package simpleFactory.pizzaType;

import simpleFactory.Pizza;

public class GreekPizza extends Pizza {

    public void prepare() {
        System.out.println("prepare GreekPizza");
    }

    public void bake() {
        System.out.println("bake GreekPizza");
    }

    public void cut() {
        System.out.println("cut GreekPizza");
    }

    public void box() {
        System.out.println("box GreekPizza");
    }
}
