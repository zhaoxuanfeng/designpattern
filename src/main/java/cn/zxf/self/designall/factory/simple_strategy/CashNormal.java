package cn.zxf.self.designall.factory.simple_strategy;

/**
 * @ClassName CashNormal
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class CashNormal  implements CashSuper{
    @Override
    public double acceptCash(double money) {
        System.out.println("全价销售！");

        return money;
    }
}
