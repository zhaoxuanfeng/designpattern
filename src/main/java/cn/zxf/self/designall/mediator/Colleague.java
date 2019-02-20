package cn.zxf.self.designall.mediator;

/**
 * @ClassName Colleague
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void send(String message);
    abstract void notifyOther(String message);
}
