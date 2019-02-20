package cn.zxf.self.designall.mediator;

/**
 * @ClassName MediatorTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class MediatorTest {
    public static void main(String[] args){
         Mediator mediator = new ConcreteMediator();
         Colleague colleagueA = new ConcreteColleagueA(mediator);
         Colleague colleagueB = new ConcreteColleagueB(mediator);

         ((ConcreteMediator) mediator).setColleagueA(colleagueA);
         ((ConcreteMediator) mediator).setColleagueB(colleagueB);

         colleagueA.send("吃饭？");
         colleagueB.send("可以");

    }
}
