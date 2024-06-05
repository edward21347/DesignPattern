package factory.HeadFirst.pizzaFactory.impl;

import factory.HeadFirst.pizzaFactory.IngreDientFactory;
import factory.HeadFirst.rawMaterial.*;
import factory.HeadFirst.rawMaterial.impl.*;

public class NYPizzaIngreDientFactory implements IngreDientFactory {
    @Override
    public Dough createDough() {
        System.out.println("添加"+ThinCrustDough.class.getSimpleName());
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("添加"+MarinaraSauce.class.getSimpleName());
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("添加"+ReggianoCheese.class.getSimpleName());
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("添加"+SlicedPepperoni.class.getSimpleName());
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        System.out.println("添加"+FreshClams.class.getSimpleName());
        return new FreshClams();
    }
}
