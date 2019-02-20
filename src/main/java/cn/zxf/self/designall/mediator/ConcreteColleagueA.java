package cn.zxf.self.designall.mediator;

/**
 * @ClassName ConcreteColleagueA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String message) {
        mediator.send(message,this);
    }

    @Override
    void notifyOther(String message) {
        System.out.println("A收到"+message);
    }


}
