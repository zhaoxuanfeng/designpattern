package cn.zxf.self.designall.factory.simple_strategy;

/**
 * @ClassName CashRebate
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class CashRebate implements  CashSuper {
    @Override
    public double acceptCash(double money) {
        System.out.println("打8折！");
        return 0.8*money;
    }
}
