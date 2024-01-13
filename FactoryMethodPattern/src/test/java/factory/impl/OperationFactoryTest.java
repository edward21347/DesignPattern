package factory.impl;

import lombok.extern.slf4j.Slf4j;
import method.IOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class OperationFactoryTest {
    @Test
    public void test(){
        OperationFactory factory = new OperationFactory();
        IOperation pow = factory.createOperation("pow");

        double result = pow.getResult(2.0, 2.0);
        log.info("result = {}",result);
    }

}