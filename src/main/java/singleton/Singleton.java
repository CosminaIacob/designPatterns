package singleton;

/**
 * All enums are initialized only once at the time of class loading,
 * so they are all singleton by default
 * Enum singletons are thread safe and they can't be broken by the reflection.
 * They're only limitation is that are eagerly instantiated.
 */
public enum Singleton {

    INSTANCE;

    private Singleton() {
        System.out.println("Instance Created");
    }
}
