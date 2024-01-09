package com.example.decoratorpattern.decorator.impl;

import com.example.decoratorpattern.decorator.Finery;

public class BigTrouser extends Finery {
    public void show(){
        System.out.print("垮裤 ");
        super.show();
    }
}
