package com.devchronicles.factory2;

import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.ejb.TransactionAttributeType;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ClientMessage {

    @Inject
    @ShortMessage
    private MessageA messageA;

    @Inject
    @LongMessage
    private MessageB messageB;

    public void doEvent() {
        messageA.setMessage("이것은 긴 이메일 메시지입니다.");
        messageB.setMessage("이것은 짧은 SMS 메시지입니다.");
        System.out.println(messageA.getMessage());
        System.out.println(messageB.getMessage());
    }
}