package com.fc.templatepattern.Method;

public class MethodContextFactory {
    public MethodContext getMethodContext(int type){
        switch(type){
            case 1:
                return new MethodContext(new Method1());
            case 2:
                return new MethodContext(new Method2());
        }
        return null;
    }
}
