package com.devchronicles.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class PriceDiscountDecorator implements Product {
    @Any
    @Inject
    @Delegate
    private Product product;

    public String generateLabel() {
        product.setPrice(product.getPrice() * 0.5);
        product.setLabel(product.getLabel() + " (할인가)");
        return product.generateLabel();
    }

    @Override
    public void setLabel(String label) {
        // TODO Auto-generated method stub
    }

    @Override
    public void setPrice(double price) {
        // TODO Auto-generated method stub
    }

    @Override
    public String getLabel() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return 0;
    }
}
