package cn.zxf.self.designall.mediator;

/**
 * @ClassName ConcreteColleagueB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteColleagueB extends Colleague {
    
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String message) {
        mediator.send(message,this);    
    }

    @Override
    void notifyOther(String message) {
        System.out.println("B收到消息"+message);
    }
}
