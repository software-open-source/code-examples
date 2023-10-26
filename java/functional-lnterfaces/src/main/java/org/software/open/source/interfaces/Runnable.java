package org.software.open.source.interfaces;

import java.util.Objects;
import java.util.logging.Logger;

@FunctionalInterface
public interface Runnable {

    void run();

    public default void printf(Object object) {
        String log = Objects.isNull(object) ? "" : object.toString();
        Logger.getLogger(Runnable.class.getName()).info(log);
    }

    public static String concat(String a, String b) {
        return a + b;
    }

}
