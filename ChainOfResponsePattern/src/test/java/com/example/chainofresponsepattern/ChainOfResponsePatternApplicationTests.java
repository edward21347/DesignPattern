package com.example.chainofresponsepattern;

import com.example.chainofresponsepattern.domain.Level1Handler;
import com.example.chainofresponsepattern.domain.Level2Handler;
import com.example.chainofresponsepattern.domain.Level3Handler;
import com.example.chainofresponsepattern.domain.Request;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChainOfResponsePatternApplicationTests {


    @Test
    public void test(){
        Level1Handler level1Handler = new Level1Handler();
        Level2Handler level2Handler = new Level2Handler();
        Level3Handler level3Handler = new Level3Handler();

        level1Handler.setSuperior(level2Handler);
        level2Handler.setSuperior(level3Handler);

        Request request1 = new Request();
        request1.setRequestLevel("1");

        level1Handler.processHandler(request1);

        Request request2 = new Request();
        request2.setRequestLevel("2");
        level1Handler.processHandler(request2);

        Request request3 = new Request();
        request3.setRequestLevel("3");
        level1Handler.processHandler(request3);

        Request request99 = new Request();
        request99.setRequestLevel("99");
        level1Handler.processHandler(request99);
    }
}
