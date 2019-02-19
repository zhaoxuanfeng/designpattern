package cn.zxf.self.designall.factory.abstractfactory;

/**
 * @ClassName ProductA_b
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class ProductA_b implements AbstractProductA {
    public ProductA_b() {
    }

    @Override
    public void show() {
        System.out.println("productA_b 的show方法");
    }
}
