package com.fc.strategypattern.Cash;

public class CashRebate extends CashSuper{
    private double rebate = 1d;

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    public void setRebate(double rebate) {
        System.out.println("折扣为:"+rebate);
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        double res = price * num * rebate;
        System.out.println("当前商品价格为:"+res);
        return res;
    }
}
