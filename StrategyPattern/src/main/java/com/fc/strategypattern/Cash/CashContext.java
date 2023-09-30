package com.fc.strategypattern.Cash;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public void setCashSuper(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double cashContextInterface(double price, int num){

        return cashSuper.acceptCash(price,num);
    }
}
