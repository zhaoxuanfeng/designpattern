package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName CreateFactoryA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class CreateFactoryA implements IAbstractFactory {

    public CreateFactoryA() {
    }

    @Override
    public IAbstractProductA createProductA() {
        IAbstractProductA abstractProductA = new ProductA_a();
        return abstractProductA;
    }

    @Override
    public IAbstractProductB createProductB() {
        IAbstractProductB abstractProductB = new ProductB_b();
        return abstractProductB;
    }
}
