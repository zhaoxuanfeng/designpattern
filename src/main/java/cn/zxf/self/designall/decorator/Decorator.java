package cn.zxf.self.designall.decorator;

/**
 * @ClassName Decorator
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public abstract class Decorator implements IComponent {
    private IComponent component;

    public  void  setComponent(IComponent component){
        this.component = component;
    }


    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
