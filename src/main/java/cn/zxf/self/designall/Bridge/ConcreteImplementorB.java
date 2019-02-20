package cn.zxf.self.designall.Bridge;

/**
 * @ClassName ConcreteImplementorB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteImplementorB implements  IImplementor{
    @Override
    public void operation() {
        System.out.println("具体实现B方法。");
    }
}
