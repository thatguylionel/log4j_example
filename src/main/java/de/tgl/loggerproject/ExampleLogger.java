package de.tgl.loggerproject;


import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class ExampleLogger {

    private static final Logger LOGGER = Logger.getLogger(ExampleLogger.class.getName());

    public static void main(String[] args) {

        for (int x = 0; x < 1000; x++) {
            LOGGER.info("X is " + x);
            LOGGER.log(Priority.INFO, "X is " + x);
        }

    }
}
