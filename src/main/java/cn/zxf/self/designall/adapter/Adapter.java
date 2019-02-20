package cn.zxf.self.designall.adapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
