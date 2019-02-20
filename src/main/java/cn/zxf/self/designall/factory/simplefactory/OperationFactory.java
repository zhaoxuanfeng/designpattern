package cn.zxf.self.designall.factory.simplefactory;

/**
 * @ClassName OperationFactory
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class OperationFactory {


    public static Object createOperate(String operate){
        Operation oper = null;
        IOperationInerface open = null;
       /* double a  = 1;
        double b = 1;*/

        switch (operate){
            case "+" :
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                open = new OperationMul();
                break;
            case  "/":
                open = new OperationDiv();
                break;
        }
//        oper.setParam(a,b);
        if(null == oper){
            return open;
        }
        return oper;


    }
}
