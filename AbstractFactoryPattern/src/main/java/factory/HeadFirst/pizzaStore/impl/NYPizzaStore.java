package factory.HeadFirst.pizzaStore.impl;

import factory.HeadFirst.pizza.Pizza;
import factory.HeadFirst.pizza.impl.CheesePizza;
import factory.HeadFirst.pizza.impl.ClamPizza;
import factory.HeadFirst.pizzaFactory.IngreDientFactory;
import factory.HeadFirst.pizzaFactory.impl.NYPizzaIngreDientFactory;
import factory.HeadFirst.pizzaStore.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        IngreDientFactory ingreDientFactory = new NYPizzaIngreDientFactory();
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingreDientFactory);
        }else if(type.equals("clams")){
            pizza = new ClamPizza(ingreDientFactory);
        }

        return pizza;
    }
}
