package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName ProductB_a
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class ProductB_a implements IAbstractProductB {
    public ProductB_a() {
    }

    @Override
    public void info() {
        System.out.println("productB_a 的info方法");
    }
}
