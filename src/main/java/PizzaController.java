import simpleFactory.PizzaStore;

public class PizzaController {

    public static void main(String args[]) {

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("veggie");
        System.out.println();
        pizzaStore.orderPizza("cheese");
    }
}
