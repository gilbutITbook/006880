package com.devchronicles.factory4;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.devchronicles.factory3.Message;
import com.devchronicles.factory3.MessageType;

@Dependent
public class MessageFactory {
    @Inject
    @Any
    private Instance<MessageType> messages;

    public MessageType getMessage(Message.Type type) {
        MessageLiteral literal = new MessageLiteral(type);
        Instance<MessageType> typeMessages = messages.select(literal);
        return typeMessages.get();
    }
}
