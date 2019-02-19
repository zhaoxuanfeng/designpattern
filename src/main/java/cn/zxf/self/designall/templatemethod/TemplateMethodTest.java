package cn.zxf.self.designall.templatemethod;

/**
 * @ClassName TemplateMethodTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class TemplateMethodTest {
    public static void main(String[] args){

          AbstractClass abstractClass ;
          abstractClass = new ConcrtetClassA();
          abstractClass.templateMethod();
          abstractClass = new ConcrtetClassB();
          abstractClass.templateMethod();

    }
}
