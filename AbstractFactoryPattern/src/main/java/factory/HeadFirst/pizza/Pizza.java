package factory.HeadFirst.pizza;

import factory.HeadFirst.rawMaterial.*;

import java.util.Arrays;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * pizza制作过程
     */
    abstract void prepare(RawMaterial... rawMaterials);

    void bake(){
        System.out.println("烘烤25min...");
    }

    void cut(){
        System.out.println("把pizza切成六份...");
    }

    void box(){
        System.out.println("把pizza装进盒子里...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
