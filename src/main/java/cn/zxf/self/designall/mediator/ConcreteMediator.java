package cn.zxf.self.designall.mediator;

/**
 * @ClassName ConcreteMediator
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteMediator implements  Mediator{

    private Colleague colleagueA  ;
    private Colleague colleagueB ;

    public void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }


    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleagueA){
            colleagueB.notifyOther(message);
        }else {
            colleagueA.notifyOther(message);
        }
    }
}
