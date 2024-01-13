package factory.impl;

import factory.AbstractFactory;
import product.AbstractProductA;
import product.AbstractProductB;
import product.impl.ProductA2;
import product.impl.ProductB2;

public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB2();
    }
}
