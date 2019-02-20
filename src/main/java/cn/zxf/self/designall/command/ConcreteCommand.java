package cn.zxf.self.designall.command;

/**
 * @ClassName ConcreteCommand
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    protected void execute() {
        receiver.action();
    }
}
