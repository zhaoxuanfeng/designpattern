package cn.zxf.self.designall.state;

/**
 * @ClassName State
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public abstract class State {
    public abstract void handle(Context context);

    public abstract  void  doSome();
}
