package factory.HeadFirst.pizzaFactory.impl;

import factory.HeadFirst.rawMaterial.*;
//原料工厂
public interface IngreDientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
