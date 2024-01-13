package factory;

import factory.impl.Factory1;
import factory.impl.Factory2;
import org.junit.jupiter.api.Test;
import product.AbstractProductA;
import product.AbstractProductB;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    public void test(){
        AbstractFactory factory = null;
        factory = new Factory1();
        AbstractProductA productA = factory.CreateProductA();
        AbstractProductB productB = factory.CreateProductB();
        productA.show();
        productB.show();
        
        factory = new Factory2();
        productA = factory.CreateProductA();
        productB = factory.CreateProductB();
        productA.show();
        productB.show();
    }

}