package cn.zxf.self.designall.Bridge;

/**
 * @ClassName RefinedAbstraction
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
