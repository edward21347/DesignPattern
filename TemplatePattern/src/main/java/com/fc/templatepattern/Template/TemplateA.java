package com.fc.templatepattern.Template;

public class TemplateA extends Template{
    @Override
    protected void concrete1() {
        System.out.println("执行方法1...");
    }

    @Override
    protected void concrete2() {
        return;
    }
}
