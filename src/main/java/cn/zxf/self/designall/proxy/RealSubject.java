package cn.zxf.self.designall.proxy;

/**
 * @ClassName RealSubject
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("实际操作任务。");
    }
}
