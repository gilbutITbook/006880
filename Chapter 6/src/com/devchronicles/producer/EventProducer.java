package com.devchronicles.producer;

import javax.enterprise.inject.Produces;

public class EventProducer {
    @Produces
    public String getMessage() {
        return "안녕하세요, 여러분!!";
    }
}