package com.fc.templatepattern;

abstract class Template {
    public void baseAlgo(){
        System.out.println("基本逻辑执行...");
        //可以结合策略模式、工厂方法模式、责任链模式
        this.concrete1();
        this.concrete2();
    }

    protected abstract void concrete1();

    protected abstract void concrete2();

}
