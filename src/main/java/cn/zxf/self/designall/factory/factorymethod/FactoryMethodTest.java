package cn.zxf.self.designall.factory.factorymethod;

import cn.zxf.self.designall.factory.simplefactory.Operation;

/**
 * @ClassName FactoryMethodTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class FactoryMethodTest {
    public static void main(String[] args){
         IFactory factory = new AddFactory();
         Operation operation = factory.createOperation();
         operation.setParam(1,30);
         double result = operation.getResult();
         System.out.println(result);
    }
}
