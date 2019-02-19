package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName CreateFactoryA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class CreateFactoryA implements AbstractFactory {

    public CreateFactoryA() {
    }

    @Override
    public AbstractProductA createProductA() {
        AbstractProductA abstractProductA = new ProductA_a();
        return abstractProductA;
    }

    @Override
    public AbstractProductB createProductB() {
        AbstractProductB abstractProductB = new ProductB_b();
        return abstractProductB;
    }
}
