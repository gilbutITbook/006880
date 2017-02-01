package com.devchronicles.singleton;

public class MySingleton3 {

    private final static MySingleton3 instance = new MySingleton3();

    private MySingleton3() {
    }

    public static MySingleton3 getInstance() {
        return instance;
    }
}
