package cn.zxf.self.designall.factory.strategy;

/**
 * @ClassName StrategyTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class StrategyTest {
    public static void main(String[] args){
         Context context ;
         context = new Context(new ConcreteStrategyA());
         context.contextInterface();

         context = new Context(new ConcreteStrategyB());
         context.contextInterface();

    }
}
