package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName AbstractFactoryTest
 * @Description TODO  反射与工厂实现还有问题
 * @Author zxf
 * @DATE 2019/2/19
 */


public class AbstractFactoryTest {



    public static void main(String[] args){
        AbstractFactory factory = null;
        AbstractProductA productA = null;
        AbstractProductB productB = null;
        factory = new CreateFactoryA();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.show();
        productB.info();

        System.out.println("----------------------------");
        factory = new CreateFactoryB();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.show();
        productB.info();

        
        System.out.println("反射实现");

        try {
            factory = ReflectAbstractFactory.createFactory("cn.zxf.self.designall.factory.abstractfactory.AbstractProductA");

            productA = factory.createProductA();
            productB = factory.createProductB();
            productA.show();
            productB.info();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
