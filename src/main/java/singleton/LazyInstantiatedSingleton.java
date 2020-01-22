package singleton;

/**
 * Singleton Pattern assures that at any time there is only on instance of the class.
 * Let's say you have an object that contains registry settings. You don't want multiple
 * copies of that object and its values running arounf -- that would lead to chaos.
 * By using an object like Singleton you can assure that every object in you app
 * is making use of the same global resource.
 * Singleton it's often used to manage pools of resources, like connection or thread pools.
 * Singleton has no public constructor. The constructor is declared private.
 * Singleton class has a static method getInstance() that returns the instance of the class.
 */
public class LazyInstantiatedSingleton {

    /**
     * We have a static variable to hold our one instance of the class Singleton
     */
    private static LazyInstantiatedSingleton uniqueInstance;

    // we can have other useful instance variables here

    /**
     * Our constructor is declared private; only Singleton can instantiate the class!
     */
    private LazyInstantiatedSingleton() {
    }

    /**
     * Th getInstance method gives us a way to instantiate the class and also to return an instance of it
     *
     * @return an instance of the Singleton
     * <p>
     * If uniqueInstance is null, then we haven't created the instance yet...
     * ...and, if it doesn't exist, we instantiate Singleton through its private constructor and assign it to uniqueInstance
     * Note that if we never need the instance, it never gets created; this is lazy instantiation.
     * By adding the synchronized keyword we force every thread to wait its turn before it can enter the method.
     * That is, no 2 threads may enter the method at the same time.
     */
    public static synchronized LazyInstantiatedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazyInstantiatedSingleton();
        }
        return uniqueInstance;
    }

    /**
     * Of course, Singleton is a normal class; it has other useful instance variables and methods
     */
    // we can have other useful methods here

    /**
     * Deserialization always creates a new instance of the class.
     * Implement this to protect Singleton form Deserialization
     * returns the existing instance; doesn't create a new one
     */
    protected Object readResolve(){
        return uniqueInstance;
    }
}
