package cn.zxf.self.designall.state;

/**
 * @ClassName ConcreteStateA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class ConcreteStateA extends  State {
    @Override
    public void handle(Context context) {
        doSome();
        context.setState(new ConcreteStateB());
    }

    @Override
    public void doSome() {
        System.out.println("状态A下的动作");
    }
}
