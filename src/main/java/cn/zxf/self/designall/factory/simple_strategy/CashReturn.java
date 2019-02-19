package cn.zxf.self.designall.factory.simple_strategy;

/**
 * @ClassName CashReturn
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class CashReturn implements CashSuper{
    @Override
    public double acceptCash(double money) {
        System.out.println("满300返100");
        return money - 100;
    }
}
