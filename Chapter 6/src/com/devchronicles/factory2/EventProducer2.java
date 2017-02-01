package com.devchronicles.factory2;

import javax.enterprise.inject.Produces;

import com.devchronicles.observer.MyEvent;

// LISTING 6??1
public class EventProducer2 {
    @Produces
    @MyEvent(MyEvent.Type.LOGGING)
    public String messageAFactory() {
        return "?대뼡 硫붿떆吏";
    }

    @Produces
    @MyEvent(MyEvent.Type.MESSAGE)
    public String messageBFactory() {
        return "???ㅻⅨ 硫붿떆吏";
    }
}
