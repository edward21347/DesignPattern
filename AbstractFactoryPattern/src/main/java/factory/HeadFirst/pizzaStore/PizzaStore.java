package factory.HeadFirst.pizzaStore;

import factory.HeadFirst.pizza.Pizza;
//抽象产品的创建者类，使用工厂方法模式
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
