package com.example.decoratorpattern.decorator.impl;

import com.example.decoratorpattern.decorator.Finery;

public class Sneakers extends Finery {
    public void show(){
        System.out.print("球鞋 ");
        super.show();
    }
}
