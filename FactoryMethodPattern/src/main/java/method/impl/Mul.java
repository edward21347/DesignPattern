package method.impl;

import method.IOperation;

public class Mul implements IOperation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
