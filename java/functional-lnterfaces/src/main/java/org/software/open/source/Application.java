package org.software.open.source;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

import org.software.open.source.interfaces.impl.MyRunnable;
import org.software.open.source.interfaces.Runnable;

public class Application {

    private static Logger log = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String timeStartProcess = "Start test process at: " + formatter.format(LocalDateTime.now());
        log.info(timeStartProcess);

        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        myRunnable.printf(myRunnable.getClass().getName());
        Runnable.concat(timeStartProcess, timeStartProcess);

        String timeEndProcess = "End test process at: " + formatter.format(LocalDateTime.now());
        log.info(timeEndProcess);

    }

    public void doSomething(Runnable runnable) {
        runnable.run();
    }

}
