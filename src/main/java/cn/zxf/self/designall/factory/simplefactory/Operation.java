package cn.zxf.self.designall.factory.simplefactory;

/**
 * @ClassName Operation
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public abstract class Operation {
    private double number_a ;
    private double number_b;


    public double getNumber_a() {
        return number_a;
    }

    public void setNumber_a(double number_a) {
        this.number_a = number_a;
    }

    public double getNumber_b() {
        return number_b;
    }

    public void setNumber_b(double number_b) {
        this.number_b = number_b;
    }

    public abstract double getResult();

    public void setParam(double number_a,double number_b){
        setNumber_a(number_a);
        setNumber_b(number_b);
    }
    
}
