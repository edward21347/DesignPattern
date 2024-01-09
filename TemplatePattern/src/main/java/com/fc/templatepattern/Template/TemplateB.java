package com.fc.templatepattern.Template;

public class TemplateB extends Template{
    @Override
    protected void concrete1() {
        System.out.println("执行方法2...");
    }

    @Override
    protected void concrete2() {
        System.out.println("执行方法1...");
    }
}
