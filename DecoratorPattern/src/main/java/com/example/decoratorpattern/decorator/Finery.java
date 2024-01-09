package com.example.decoratorpattern.decorator;

import com.example.decoratorpattern.chara.ICharactor;

//服饰类
public class Finery implements ICharactor {
    protected ICharactor component;

    public void decorate(ICharactor component){
        this.component = component;
    }

    @Override
    public void show() {
        if(this.component!=null){
            this.component.show();
        }
    }
}

