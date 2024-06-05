package factory.HeadFirst.pizza.impl;

import factory.HeadFirst.pizza.Pizza;
import factory.HeadFirst.pizzaFactory.IngreDientFactory;

public class ClamPizza extends Pizza {
    IngreDientFactory factory;

    public ClamPizza(IngreDientFactory factory) {
        this.factory = factory;
        name = "纽约风味蛤蜊披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备"+name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clams = factory.createClams();

    }

}
