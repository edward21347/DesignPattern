package com.example.compositepattern;

public class HRDepartMent extends Company{
    public HRDepartMent(String name) {
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
        System.out.println(name + ":员工招聘培训管理");
    }
}
