package factory.HeadFirst.pizza.impl;

import factory.HeadFirst.pizza.Pizza;
import factory.HeadFirst.pizzaFactory.IngreDientFactory;

public class CheesePizza extends Pizza {
    IngreDientFactory factory;

    public CheesePizza(IngreDientFactory factory) {
        this.factory = factory;
        name = "纽约风味奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("准备"+name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }

}
