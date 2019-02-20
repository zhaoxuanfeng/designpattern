package cn.zxf.self.designall.memento;

/**
 * @ClassName Originator
 * @Description TODO  发起人
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Originator {
    private String state;

    private Memento memento = null;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }
    
    public void show(){
        System.out.println(this.state);
    }

}
