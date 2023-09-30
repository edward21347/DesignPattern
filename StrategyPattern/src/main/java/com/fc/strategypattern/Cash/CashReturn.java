package com.fc.strategypattern.Cash;

public class CashReturn extends CashSuper{
    private int moneyCondition;
    private int moneyReturn;

    public CashReturn(int moneyCondition, int moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    public void setMoneyCondition(int moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public void setMoneyReturn(int moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {

        double v = price * num;
        if(v >= moneyCondition){
            double v1 = v - moneyReturn;
            System.out.println("当前商品价格为:"+v1);

            return v1;
        }else{
            return v;
        }
    }
}
