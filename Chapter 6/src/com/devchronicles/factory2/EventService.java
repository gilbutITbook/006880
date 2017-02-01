package com.devchronicles.factory2;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
    @Inject
    private MessageA messageA;
    @Inject
    private MessageB messageB;

    public void startService() {
        messageA.setMessage("이것은 메시지 A입니다.");
        messageB.setMessage("이것은 메시지 B입니다.");
        System.out.println("서비스 호출 시작: " + messageA.getMessage());
        System.out.println("서비스 호출 시작: " + messageB.getMessage());
    }
}
