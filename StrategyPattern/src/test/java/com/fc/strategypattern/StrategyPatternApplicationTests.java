package com.fc.strategypattern;

import com.fc.strategypattern.Cash.CashContext;
import com.fc.strategypattern.Cash.CashFactory;
import com.fc.strategypattern.Strategy.Context;
import com.fc.strategypattern.Strategy.StrategyA;
import com.fc.strategypattern.Strategy.StrategyB;
import com.fc.strategypattern.Strategy.StrategyC;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyPatternApplicationTests {

    @Test
    void contextLoads() {
        Context context = new Context(new StrategyA());
        context.contextInterface();
        context.setStrategy(new StrategyB());
        context.contextInterface();
        context.setStrategy(new StrategyC());
        context.contextInterface();
    }

    @Test
    void cashFactoryTest(){
        CashFactory factory = new CashFactory();
        CashContext cashAccept1 = factory.createCashAccept(1);
        cashAccept1.cashContextInterface(10,20);
        CashContext cashAccept2 = factory.createCashAccept(2);
        cashAccept2.cashContextInterface(20,20);
        CashContext cashAccept3 = factory.createCashAccept(3);
        cashAccept3.cashContextInterface(30,20);

    }
}
