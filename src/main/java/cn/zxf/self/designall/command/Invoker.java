package cn.zxf.self.designall.command;

/**
 * @ClassName Invoker
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
