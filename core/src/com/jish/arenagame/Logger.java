package com.jish.arenagame;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;

public class Logger {
    private static final String messagePrepend = ": ";

    public static void init() {
        Gdx.app.setLogLevel(Application.LOG_INFO);
        log(Logger.class, "Successfully initialized.");
    }

    public static void log(Class<?> caller, String message) {
        Gdx.app.log(caller.getSimpleName(), messagePrepend+message);
    }

    public static void error(Class<?> caller, String message) {
        Gdx.app.error(caller.getSimpleName(), messagePrepend+message);
    }

    public static void debug(Class<?> caller, String message) {
        Gdx.app.debug(caller.getSimpleName(), messagePrepend+message);
    }
}
