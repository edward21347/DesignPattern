package com.example.decoratorpattern.decorator.impl;

import com.example.decoratorpattern.decorator.Finery;

public class TShirt extends Finery {
    public void show(){
        System.out.print("T恤 ");
        super.show();
    }
}
