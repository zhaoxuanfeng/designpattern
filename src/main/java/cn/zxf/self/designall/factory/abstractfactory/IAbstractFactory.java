package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName IAbstractFactory
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public interface IAbstractFactory {

    IAbstractProductA createProductA();
    IAbstractProductB createProductB();
}
