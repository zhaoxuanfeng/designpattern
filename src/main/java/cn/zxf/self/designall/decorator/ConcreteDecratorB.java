package cn.zxf.self.designall.decorator;

/**
 * @ClassName ConcreteDecratorB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ConcreteDecratorB extends Decorator {
    
    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("装饰对象B的具体操作！");
    }

    private void addedBehavior() {
        System.out.println("执行B的方法！");
    }

}
