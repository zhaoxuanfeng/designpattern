package cn.zxf.self.designall.templatemethod;

/**
 * @ClassName ConcrtetClass
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class ConcrtetClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("A类中具体方法1的实现！");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("A类中具体方法2的实现！");
    }
}
