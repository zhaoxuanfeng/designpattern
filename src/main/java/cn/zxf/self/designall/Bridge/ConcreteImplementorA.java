package cn.zxf.self.designall.Bridge;

/**
 * @ClassName ConcreteImplementorA
 * @Description TODO  
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteImplementorA implements  IImplementor{
    
    
    @Override
    public void operation() {
            System.out.println("具体实现A方法。");
    }
}
