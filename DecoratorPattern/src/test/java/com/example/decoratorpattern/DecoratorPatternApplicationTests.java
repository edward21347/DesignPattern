package com.example.decoratorpattern;

import com.example.decoratorpattern.chara.impl.Person;
import com.example.decoratorpattern.decorator.impl.BigTrouser;
import com.example.decoratorpattern.decorator.impl.Sneakers;
import com.example.decoratorpattern.decorator.impl.TShirt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DecoratorPatternApplicationTests {

    @Test
    void test() {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮:");

        Sneakers pqx = new Sneakers();
        pqx.decorate(xc);

        BigTrouser kk = new BigTrouser();
        kk.decorate(pqx);

        TShirt tShirt = new TShirt();
        tShirt.decorate(kk);

        tShirt.show();
    }

}
