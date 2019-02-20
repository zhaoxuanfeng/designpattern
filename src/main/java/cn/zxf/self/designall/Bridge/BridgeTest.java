package cn.zxf.self.designall.Bridge;

/**
 * @ClassName BridgeTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class BridgeTest {
    public static void main(String[] args){

          Abstraction ab = new RefinedAbstraction();

          ab.setImplementor(new ConcreteImplementorA());
          ab.operation();

          ab.setImplementor(new ConcreteImplementorB());
          ab.operation();



          Phone phoneA = new PhoneA();
          phoneA.setSoftware(new SoftwareA());
          phoneA.run();

          Phone phoneB = new PhoneB();
          phoneB.setSoftware(new SoftwareB());
          phoneB.run();

    }

}
