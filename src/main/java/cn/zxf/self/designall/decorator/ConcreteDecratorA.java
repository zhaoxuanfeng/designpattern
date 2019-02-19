package cn.zxf.self.designall.decorator;

/**
 * @ClassName ConcreteDecratorA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ConcreteDecratorA extends Decorator {
    
    private String addedState;
    
    public void operation(){
        super.operation();
        addedState = "New state";
        System.out.println(addedState);
        System.out.println("具体装饰对象A的操作！");
    }
}
