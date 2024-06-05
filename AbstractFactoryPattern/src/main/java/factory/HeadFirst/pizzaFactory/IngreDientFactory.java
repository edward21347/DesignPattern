package factory.HeadFirst.pizzaFactory;

import factory.HeadFirst.rawMaterial.*;
//原料工厂，一组抽象产品的创建者，使用抽象工程模式
public interface IngreDientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
