package factory.impl;

import factory.AbstractFactory;
import product.AbstractProductA;
import product.AbstractProductB;
import product.impl.ProductA1;
import product.impl.ProductB1;

public class Factory1 extends AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB1();
    }
}
