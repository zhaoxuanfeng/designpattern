package cn.zxf.self.designall.facade;

/**
 * @ClassName FacadeTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class FacadeTest {
    public static void main(String[] args){

          Facade facade = new Facade();
          facade.methodA();
          System.out.println("-----------------");
          facade.methodB();
    }

}
