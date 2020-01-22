package simpleFactory.pizzaType;

        import simpleFactory.Pizza;

public class VeggiePizza extends Pizza {

    public void prepare() {
        System.out.println("prepare VeggiePizza");
    }

    public void bake() {
        System.out.println("bake VeggiePizza");
    }

    public void cut() {
        System.out.println("cut VeggiePizza");
    }

    public void box() {
        System.out.println("box VeggiePizza");
    }
}
