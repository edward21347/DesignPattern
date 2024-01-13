package factory.impl;

import factory.IFactory;
import method.IOperation;

public class OperationFactory implements IFactory {
    @Override
    public IOperation createOperation(String operType) {
        IOperation operation = null;
        IFactory factory = null;
        switch (operType){
            case "+": case "-": case "*": case "/":
                factory = new BasicOperationFactory();
            case "pow": case "log":
                factory = new AdvancedOperationFactory();
        }
        if(null != factory){
            operation = factory.createOperation(operType);
        }
        return operation;
    }
}
