package singleton;
/**
 * Singleton pattern example with static factory method
 */

public class StaticFactoryMethodSingleton {
    //initailzed during class loading
    private static final StaticFactoryMethodSingleton instance = new StaticFactoryMethodSingleton();
    private StaticFactoryMethodSingleton() {}

    public static StaticFactoryMethodSingleton getInstance() {
        return instance;
    }

    // Problem: serde:
    // readResolve to prevent another instance of Singleton
    private Object readResolve(){
        return instance;
    }
}
