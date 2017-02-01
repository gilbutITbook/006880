package com.devchronicles.singleton;

public class MySingleton1 {
    private static MySingleton1 instance;

    private MySingleton1() {
    }

    public static MySingleton1 getInstance() {
        if (instance == null) { // 1
            instance = new MySingleton1();
        }
        return instance;
    }
}
