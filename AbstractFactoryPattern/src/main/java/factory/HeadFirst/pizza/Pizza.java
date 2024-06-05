package factory.HeadFirst.pizza;

import factory.HeadFirst.rawMaterial.*;

import java.util.Arrays;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    /**
     * pizza制作过程
     */
    public abstract void prepare();

    public void bake(){
        System.out.println("烘烤"+name+"25min...");
    }

    public void cut(){
        System.out.println("把"+name+"切成六份...");
    }

    public void box(){
        System.out.println("把"+name+"装进盒子里...");
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
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
