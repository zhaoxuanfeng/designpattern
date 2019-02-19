package cn.zxf.self.designall.factory.factorymethod;

import cn.zxf.self.designall.factory.simplefactory.Operation;
import cn.zxf.self.designall.factory.simplefactory.OperationSub;

/**
 * @ClassName SubFactory
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return  new OperationSub();
    }
}
