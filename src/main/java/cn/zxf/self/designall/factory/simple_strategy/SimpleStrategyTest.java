package cn.zxf.self.designall.factory.simple_strategy;

/**
 * @ClassName SimpleStrategyTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class SimpleStrategyTest {
    public static void main(String[] args){
         CashContext cashContext = new CashContext("正常收费");
         double result = cashContext.getResult(100);
         System.out.println(result);


    }
}
