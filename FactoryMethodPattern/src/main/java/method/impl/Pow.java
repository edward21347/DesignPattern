package method.impl;

import method.IOperation;

public class Pow implements IOperation {
    @Override
    public double getResult(double numberA, double numberB) {
        return Math.pow(numberA,numberB);
    }
}
