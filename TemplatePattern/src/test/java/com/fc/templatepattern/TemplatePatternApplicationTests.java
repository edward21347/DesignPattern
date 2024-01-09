package com.fc.templatepattern;

import com.fc.templatepattern.Template.TemplateA;
import com.fc.templatepattern.Template.TemplateB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplatePatternApplicationTests {

    @Test
    void contextLoads() {
        TemplateB templateB = new TemplateB();
        templateB.baseAlgo();
        TemplateA templateA = new TemplateA();
        templateA.baseAlgo();
    }

}
