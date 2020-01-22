package singleton;

/**
 * Bill Pugh implementation of Singleton
 * As synchronized method/block causes performance issues, Bill Pugh comes with a different approach:
 * using private static inner class.
 * This method os thread safe and doesn't require synchronization.
 */
public class SingletonWithInnerClass {

    private SingletonWithInnerClass() {
    }

    // private static inner class which is loadded when getInstance() is first called
    private static class SingletonHelper {
        private static final SingletonWithInnerClass instance = new SingletonWithInnerClass();
    }

    // global access point to instance
    public static SingletonWithInnerClass getInstance() {
        return SingletonHelper.instance;
    }


}
