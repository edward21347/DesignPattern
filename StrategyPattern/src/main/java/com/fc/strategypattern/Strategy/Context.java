package com.fc.strategypattern.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
