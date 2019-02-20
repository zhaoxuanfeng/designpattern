package cn.zxf.self.designall.command;


/**
 * @ClassName ICommand
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    protected abstract  void  execute();

}
