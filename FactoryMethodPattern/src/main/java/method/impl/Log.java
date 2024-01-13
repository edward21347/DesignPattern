package method.impl;

import method.IOperation;

public class Log implements IOperation {
    @Override
    public double getResult(double numberA, double numberB) {
        return Math.log(numberB)/Math.log(numberA);
    }
}
