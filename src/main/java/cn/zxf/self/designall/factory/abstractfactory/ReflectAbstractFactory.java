package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName ReflectAbstractFactory
 * @Description TODO  反射+抽象工厂
 * @Author zxf
 * @DATE 2019/2/19
 */
public  class ReflectAbstractFactory {

    public ReflectAbstractFactory(){

    }
    public static IAbstractFactory createFactory(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IAbstractFactory) Class.forName(name).newInstance();
    }
}
