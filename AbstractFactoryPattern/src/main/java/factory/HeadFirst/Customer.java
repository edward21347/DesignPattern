package factory.HeadFirst;

import factory.HeadFirst.pizzaStore.PizzaStore;
import factory.HeadFirst.pizzaStore.impl.NYPizzaStore;

import java.util.Map;

/*
披萨店制作不同的披萨
    披萨的口味有多种，将不同口味披萨的制作过程封装进工厂 - 简单工厂（将披萨店与披萨制作过程解耦）

按照区域划分，又有多个披萨店，每个披萨店有自己的制作过程
    定义一个标准化流程披萨店，流程为 下单披萨 -> 制作披萨
        不同区域的披萨店各自制作披萨的流程 - 工厂方法
            此时，由于披萨也有多种。因此需要既按照口味又按照区域定义多个披萨。每一个具体披萨的制作过程分散在每一个具体的披萨店 制作披萨 的流程当中
                此时，每一个披萨店都依赖多种口味的具体披萨对象。违反了针对接口编程，而不是针对实现编程的原则。
                     （将顾客与具体的披萨店和具体的披萨对象解耦，顾客只知道自己是在标准化流程披萨店点披萨）
                     （由于每个具体披萨店都要生产一组具体的披萨，考虑以抽象工厂解耦）

披萨制作时有不同的原料，每个种类的披萨（奶酪、蛤蜊）通过添加不同地区的原料形成各地区特色口味的披萨。在披萨对象中添加原料工厂，工厂提供一组该地区的原料 - 抽象工厂
    地区的披萨店此时依赖各个种类的披萨与该地区的原料工厂。通过将具体的原料工厂传递给披萨对象，实现制作不同地区不同口味的披萨。
        （将具体披萨店与具体的披萨对象解耦，但似乎解耦仍不完全？）
*/

/*
总结：
    抽象工厂：创建一系列产品的N种具体实现时，从具体实现解耦
    工厂方法：创建多个具体产品，从具体实现解耦
 */

public class Customer {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        System.out.println("肖旺点了一张披萨！");
        pizzaStore.orderPizza("cheese");

        System.out.println("\n小狗点了一张披萨！");
        pizzaStore.orderPizza("clams");
    }
}
