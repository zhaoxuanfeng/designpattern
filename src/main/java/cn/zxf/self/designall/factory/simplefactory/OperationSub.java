package cn.zxf.self.designall.factory.simplefactory;

/**
 * @ClassName OperationSub
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber_a() - getNumber_b();
        return 0;
    }
}
