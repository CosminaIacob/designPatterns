package factory.stores;

import factory.*;
import factory.pizzaType.chicagoStore.ChicagoStyleCheesePizza;
import factory.pizzaType.chicagoStore.ChicagoStyleGreekPizza;
import factory.pizzaType.chicagoStore.ChicagoStylePepperoniPizza;
import factory.pizzaType.chicagoStore.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
   public  Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
