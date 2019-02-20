package cn.zxf.self.designall.factory.simplefactory;

/**
 * @ClassName SimpleFactoryTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class SimpleFactoryTest {

    public static void main(String[] args){
        /* Operation oper ;
         oper = (Operation) OperationFactory.createOperate("+");
         oper.setParam(1,2);
         double result = oper.getResult();
         */

        IOperationInerface open;
        open = (IOperationInerface) OperationFactory.createOperate("*");
        open.setParam(2,4);
        double result = open.getResult("*");

        System.out.println(result);

    }
}
