package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName CreateFactoryB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class CreateFactoryB implements AbstractFactory {
    public CreateFactoryB() {
    }

    @Override
    public AbstractProductA createProductA() {
        AbstractProductA abstractProductA = new ProductA_b();
        return abstractProductA;
    }

    @Override
    public AbstractProductB createProductB() {
        AbstractProductB abstractProductB = new ProductB_a();
        return abstractProductB;
    }
}
