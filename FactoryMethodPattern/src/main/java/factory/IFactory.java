package factory;

import method.IOperation;

public interface IFactory {
    public IOperation createOperation(String operType);
}
