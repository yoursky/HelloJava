package designPattern.singleton;
/**
 * Singleton pattern example with Double checked Locking
 */

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;  // since Java 5
    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // double checked locking (双重校验加锁）
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

// Lazy loaded thread-safe Singleton