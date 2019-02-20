package cn.zxf.self.designall.state;

/**
 * @ClassName Context
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态是"+ state.getClass().getName());
    }

    public void request(){
        state.handle(this);
    }


}
