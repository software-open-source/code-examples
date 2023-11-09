package org.software.open.source.patterns.singleton;

/**
 * https://www.javatpoint.com/singleton-design-pattern-in-java
 * 
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}
