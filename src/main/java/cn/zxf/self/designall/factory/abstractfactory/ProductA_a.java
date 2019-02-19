package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName ProductA_a
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class ProductA_a implements AbstractProductA {
    public ProductA_a() {
    }

    @Override
    public void show() {
        System.out.println("productA_a 的show方法");
    }
}
