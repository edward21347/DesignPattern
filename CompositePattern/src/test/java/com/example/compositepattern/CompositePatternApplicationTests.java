package com.example.compositepattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompositePatternApplicationTests {

    @Test
    void contextLoads() {
        ConcreteCompany root = new ConcreteCompany("国家电网公司");
        root.add(new HRDepartMent("人力资源部"));
        root.add(new FinanceDepartMent("财务部"));

        ConcreteCompany hdkj = new ConcreteCompany("华中科技公司");
        hdkj.add(new HRDepartMent("人力资源部"));
        hdkj.add(new FinanceDepartMent("财务部"));
        root.add(hdkj);

        System.out.println("组织结构:");
        root.display(1);

        System.out.println("部门履责:");
        root.lineOfDuty();

    }

}
