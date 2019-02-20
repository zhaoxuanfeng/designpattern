package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName CreateFactoryB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class CreateFactoryB implements IAbstractFactory {
    public CreateFactoryB() {
    }

    @Override
    public IAbstractProductA createProductA() {
        IAbstractProductA abstractProductA = new ProductA_b();
        return abstractProductA;
    }

    @Override
    public IAbstractProductB createProductB() {
        IAbstractProductB abstractProductB = new ProductB_a();
        return abstractProductB;
    }
}
