package com.onlineBank.utility;

import org.testng.log4testng.Logger;

public class Log {
    //Initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName());
                        // Need to create these methods, so that they can be called
    public static void info(String message) {
    Log.info(message);
    }
}