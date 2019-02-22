package cn.zxf.self.designall.visitor;

/**
 * @ClassName ConcreteElementB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class ConcreteElementB  implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    
    public  void show(){
        System.out.println("ConcreteElementB");
    }
}
