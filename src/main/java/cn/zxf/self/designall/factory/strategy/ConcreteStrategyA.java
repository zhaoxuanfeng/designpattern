package cn.zxf.self.designall.factory.strategy;

/**
 * @ClassName ConcreteStrategy
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("实现A算法。");
    }
}
