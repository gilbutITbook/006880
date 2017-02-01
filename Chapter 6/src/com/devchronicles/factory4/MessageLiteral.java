package com.devchronicles.factory4;

import javax.enterprise.util.AnnotationLiteral;

import com.devchronicles.factory3.Message;

public class MessageLiteral extends AnnotationLiteral<Message> implements Message {
    private static final long serialVersionUID = 1L;
    private Type type;

    public MessageLiteral(Type type) {
        this.type = type;
    }

    public Type value() {
        return type;
    }
}