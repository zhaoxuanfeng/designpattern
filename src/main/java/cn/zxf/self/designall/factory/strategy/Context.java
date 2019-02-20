package cn.zxf.self.designall.factory.strategy;

/**
 * @ClassName Context
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class Context {

    IStrategy strategy ;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}
