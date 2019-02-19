package cn.zxf.self.designall.decorator;

/**
 * @ClassName DecoratorTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class DecoratorTest {

   public static void main(String[] args){
       ConcreteComponent concreteComponent = new ConcreteComponent();
//       ConcreteDecratorA a = new ConcreteDecratorA();
//       ConcreteDecratorB b = new ConcreteDecratorB();
       Decorator a = new ConcreteDecratorA();
       Decorator b = new ConcreteDecratorB();
       a.setComponent(concreteComponent);
       b.setComponent(concreteComponent);
       a.operation();
       b.operation();

   }

}
