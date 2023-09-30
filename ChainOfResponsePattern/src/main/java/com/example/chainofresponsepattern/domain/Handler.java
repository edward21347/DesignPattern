package com.example.chainofresponsepattern.domain;

abstract class Handler {
    protected Handler superior;

    public void setSuperior(Handler superior) {
        this.superior = superior;
    }

    public abstract void processHandler(Request request);
}
