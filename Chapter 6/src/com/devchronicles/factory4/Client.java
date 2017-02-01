package com.devchronicles.factory4;

import javax.ejb.TransactionAttribute;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ejb.TransactionAttributeType;
import com.devchronicles.factory3.MessageType;
import com.devchronicles.factory3.Message;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
@ApplicationScoped
public class Client {
    @Inject
    MessageFactory mf;

    public void doMessage() {
        MessageType m = mf.getMessage(Message.Type.SHORT);
        m.setMessage("이것은 짧은 메시지입니다.");
        System.out.println(m.getMessage());
        m = mf.getMessage(Message.Type.LONG);
        m.setMessage("이것은 긴 메시지입니다.");
        System.out.println(m.getMessage());
    }
}
