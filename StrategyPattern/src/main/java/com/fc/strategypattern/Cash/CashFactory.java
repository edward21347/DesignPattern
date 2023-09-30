package com.fc.strategypattern.Cash;

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
