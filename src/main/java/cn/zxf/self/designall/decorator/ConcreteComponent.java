package cn.zxf.self.designall.decorator;

/**
 * @ClassName ConcreteComponent
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ConcreteComponent implements  Component {
    @Override
    public void operation() {
        System.out.println("负责基本的内容！");
    }
}
