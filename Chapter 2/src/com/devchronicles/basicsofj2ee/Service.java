package com.devchronicles.basicsofj2ee;

import javax.inject.Inject;

public class Service {
    @Inject
    private Message message;

    public void showMessage() {
        System.out.println(message.getMessage());
    }
}