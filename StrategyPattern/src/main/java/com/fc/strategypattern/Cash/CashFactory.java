package com.fc.strategypattern.Cash;
//策略模式与工厂模式结合使用，隐藏算法/策略的实现，让客户只调用就行了
public class CashFactory {

    public CashContext createCashAccept(int cashType){
        switch (cashType){
            case 1:
                return new CashContext(new CashNormal());
            case 2:
                return new CashContext(new CashRebate(0.8d));
            case 3:
                return new CashContext(new CashReturn(300,100));
        }
        return null;
    }
}
