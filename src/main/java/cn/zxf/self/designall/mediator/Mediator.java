package cn.zxf.self.designall.mediator;

/**
 * @ClassName Mediator
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public interface Mediator {
    void send(String message,Colleague colleague);
}
