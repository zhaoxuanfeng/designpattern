package cn.zxf.self.designall.factory.simplefactory;

/**
 * @ClassName OperationMul
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class OperationMul implements IOperationInerface {

    private double number_a = 0;
    private double number_b = 0;

    @Override
    public double getResult(String operate) {
        double result = 0;
        result = number_a * number_b;
        return result;
    }

    @Override
    public void setParam(double number_a, double number_b) {
        this.number_a = number_a;
        this.number_b = number_b;
    }
}
