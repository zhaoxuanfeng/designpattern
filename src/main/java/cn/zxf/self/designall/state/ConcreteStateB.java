package cn.zxf.self.designall.state;

/**
 * @ClassName ConcreteStateB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        doSome();
        context.setState(new ConcreteStateA());
    }

    @Override
    public void doSome() {
        System.out.println("状态B下的动作");
    }


}
