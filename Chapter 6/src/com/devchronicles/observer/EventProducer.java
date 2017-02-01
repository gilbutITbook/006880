package com.devchronicles.observer;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

// LISTING 6-23
public class EventProducer {
    @Produces
    @Named("Logging")
    public String messageAFactory() {
        return "어떤 메시지";
    }

    @Produces
    @Named("Message")
    public String messageBFactory() {
        return "또 다른 메시지";
    }
}