package com.devchronicles.singleton;

public class MySingleton2 {

    private static MySingleton2 instance;

    private MySingleton2() {
    }

    public static synchronized MySingleton2 getInstance() {
        if (instance == null) {
            instance = new MySingleton2();
        }
        return instance;
    }
}
