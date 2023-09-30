package com.fc.templatepattern.Method;

public class MethodContext {
    private SuperMethod superMethod;

    public MethodContext(SuperMethod superMethod) {
        this.superMethod = superMethod;
    }

    public void contextInterface(){
        this.superMethod.algorithmInterface();
    }
}
