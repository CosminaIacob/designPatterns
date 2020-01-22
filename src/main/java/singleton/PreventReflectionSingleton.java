package singleton;

/**
 * Reflection API is a powerful API in java which can be used
 * to instantiate any class even the class has private constructors.
 * This will break the singleton design pattern.
 * To prevent your singleton from Reflection API,
 * just throw an IllegalStateException from private constructor
 * if anybody tries to create second instance, just like below.
 */
public class PreventReflectionSingleton {

    private static final PreventReflectionSingleton instance = new PreventReflectionSingleton();

    private PreventReflectionSingleton() {
        throw new IllegalStateException("Instance already created");
    }

    public static PreventReflectionSingleton getInstance() {
        return instance;
    }

}
