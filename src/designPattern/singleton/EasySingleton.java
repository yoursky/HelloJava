package designPattern.singleton;
/**
 * Singleton pattern example using Java Enumj
 * Benefits:
 * 1. thread safe;
 * 2. serialization is guaranteed by JVM
 * 3. easy
 */

public enum EasySingleton {
    INSTANCE;

    public void show() {
        System.out.println("Singleton Method");
    }
}

// https://javarevisited.blogspot.com/2012/07/why-enum-singleton-are-better-in-java.html