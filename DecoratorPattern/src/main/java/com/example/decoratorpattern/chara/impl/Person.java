package com.example.decoratorpattern.chara.impl;

import com.example.decoratorpattern.chara.ICharactor;

public class Person implements ICharactor {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的"+name);
    }
}
