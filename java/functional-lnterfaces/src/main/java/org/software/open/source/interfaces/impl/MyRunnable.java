package org.software.open.source.interfaces.impl;

import java.util.logging.Logger;

import org.software.open.source.interfaces.Runnable;

public class MyRunnable implements Runnable {

    private static Logger log = Logger.getLogger(MyRunnable.class.getName());

    @Override
    public void run() {
        log.info("Pritnt My Runnable");
    }

}
