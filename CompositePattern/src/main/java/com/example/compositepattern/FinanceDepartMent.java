package com.example.compositepattern;

public class FinanceDepartMent extends Company{
    public FinanceDepartMent(String name) {
        super(name);
    }

    @Override
    void add(Company c) {

    }

    @Override
    void remove(Company c) {

    }

    @Override
    void display(int depth) {
        System.out.println(new String(new char[depth]).replace('\0','-') + name);
    }

    @Override
    void lineOfDuty() {
        System.out.println(name + ":公司财务管理");
    }
}
