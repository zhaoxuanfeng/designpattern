package cn.zxf.self.designall.memento;

/**
 * @ClassName MementoTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class MementoTest {
    public static void main(String[] args){

          Originator originator = new Originator();
          originator.setState("升级了 ");
          originator.show();

          Caretaker caretaker = new Caretaker();
          caretaker.setMemento(originator.createMemento());


          originator.setState("打Boss");
          originator.show();

          originator.setMemento(caretaker.getMemento());
          originator.show();

    }
}
