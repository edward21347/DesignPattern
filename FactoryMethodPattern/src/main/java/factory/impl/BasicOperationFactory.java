package factory.impl;

import factory.IFactory;
import method.IOperation;
import method.impl.Add;
import method.impl.Div;
import method.impl.Mul;
import method.impl.Sub;

public class BasicOperationFactory implements IFactory {
    @Override
    public IOperation createOperation(String operType) {
        IOperation operation = null;
        switch (operType){
            case "+":
                operation = new Add();
            case "-":
                operation = new Sub();
            case "*":
                operation = new Mul();
            case "/":
                operation = new Div();
        }
        return operation;
    }
}
