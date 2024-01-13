package factory.impl;

import factory.IFactory;
import method.IOperation;
import method.impl.Log;
import method.impl.Pow;

public class AdvancedOperationFactory implements IFactory {
    @Override
    public IOperation createOperation(String operType) {
        IOperation operation = null;
        switch (operType){
            case "pow":
                operation = new Pow();
            case "log":
                operation = new Log();
        }
        return operation;
    }
}
