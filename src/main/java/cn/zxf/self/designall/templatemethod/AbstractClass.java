package cn.zxf.self.designall.templatemethod;

/**
 * @ClassName AbstractClass
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public abstract class AbstractClass {
    public abstract void  primitiveOperation1();
    public abstract void  primitiveOperation2();


    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("AbstractClass...");
    }
}
