package factory.stores;

import factory.*;
import factory.pizzaType.nyStore.NYStyleCheesePizza;
import factory.pizzaType.nyStore.NYStyleGreekPizza;
import factory.pizzaType.nyStore.NYStylePepperoniPizza;
import factory.pizzaType.nyStore.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
   public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            return new NYStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
