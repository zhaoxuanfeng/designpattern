package cn.zxf.self.designall.proxy;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class Proxy implements  Subject {

    RealSubject realSubject;

    public  Proxy(){
    }

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
