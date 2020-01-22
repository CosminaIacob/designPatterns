package singleton;

public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    volatile static private ChocolateBoiler uniqueChocolateBoiledInstance;

    // This code is only started when the boiler is empty!
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueChocolateBoiledInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueChocolateBoiledInstance == null) {
                    uniqueChocolateBoiledInstance = new ChocolateBoiler();
                }
            }

        }

        return uniqueChocolateBoiledInstance;
    }

    // To fill the boiled it must be empty and,
    // once it's full, we set the empty and boiled flags.
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //fill the boiled with a milk/chocolate mixture
        }
    }

    // To drain the boiler, it must be full and also boiled.
    // Once it is drained we set empty back to true.
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    // To boil the moxture, the boiler has to be full and not already boiled.
    // Once its is boiled we set the boiled flag to tue.
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
