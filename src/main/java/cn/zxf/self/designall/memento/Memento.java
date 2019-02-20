package cn.zxf.self.designall.memento;

/**
 * @ClassName memento
 * @Description TODO  备忘录
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
