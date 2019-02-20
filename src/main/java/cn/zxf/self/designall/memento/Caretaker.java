package cn.zxf.self.designall.memento;

/**
 * @ClassName Caretaker
 * @Description TODO  管理者
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
