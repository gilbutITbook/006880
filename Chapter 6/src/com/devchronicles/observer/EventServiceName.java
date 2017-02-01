package com.devchronicles.observer;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventServiceName {
    
    @Inject
    @Named("Logging")
    private String messageA;
    
    @Inject
    @Named("Message")
    private String messageB;

    public void startService() {
        System.out.println("서비스 호출 시작: " + messageA);
        System.out.println("서비스 호출 시작: " + messageB);
    }
}
