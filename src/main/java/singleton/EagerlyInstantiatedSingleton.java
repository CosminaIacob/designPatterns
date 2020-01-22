package singleton;

public class EagerlyInstantiatedSingleton {

    /**
     * Creating an instance of Singleton in a static initializer.
     * This code os thread safe!
     * The JVM  creates the unique instance of the Singleton when the class is loaded.
     * The JVM guarantees that the instance will be created before any thread accesses
     * the static uniqueInstance variable.
     */
    private static EagerlyInstantiatedSingleton uniqueInstance = new EagerlyInstantiatedSingleton();

    private EagerlyInstantiatedSingleton() {
    }

    public static EagerlyInstantiatedSingleton getInstance() {
        return uniqueInstance;
    }
}
