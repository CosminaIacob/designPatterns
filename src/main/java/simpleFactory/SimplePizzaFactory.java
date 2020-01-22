package simpleFactory;

import simpleFactory.pizzaType.CheesePizza;
import simpleFactory.pizzaType.GreekPizza;
import simpleFactory.pizzaType.PepperoniPizza;
import simpleFactory.pizzaType.VeggiePizza;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
