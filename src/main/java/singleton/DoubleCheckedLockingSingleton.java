package singleton;

public class DoubleCheckedLockingSingleton {

    /**
     * the volatile keyword ensures that multiple threads handle the uniqueInstance
     * variable correctly when it is being initialized to the Singleton instance
     */
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {

        // check for an instance and if there isn't one, enter a synchronized block
        if (uniqueInstance == null) {

            // we only synchronize first time through!
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {

                    //once in the block, check again anf is still null, create an instance
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
