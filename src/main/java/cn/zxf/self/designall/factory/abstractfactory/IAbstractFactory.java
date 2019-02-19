package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public interface AbstractFactory {

    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
