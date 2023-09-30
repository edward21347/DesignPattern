package com.fc.strategypattern.Cash;

public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double price, int num) {
        System.out.println("正常价格...");
        return price * num;
    }
}
