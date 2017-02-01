package com.devchronicles.decorator;

public abstract class Extra implements Order {
    protected Order order;
    protected String label;
    protected double price;

    public Extra(String label, double price, Order order) {
        this.label = label;
        this.price = price;
        this.order = order;
    }

    // 단가는 민감한 문제이므로 실제 구현부에 위임합니다.
    public abstract double getPrice();

    // 표준 라벨 형식입니다.
    public String getLabel() {
        return order.getLabel() + ", " + this.label;
    }
}