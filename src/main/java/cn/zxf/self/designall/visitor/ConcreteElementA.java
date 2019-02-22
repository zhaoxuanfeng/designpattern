package cn.zxf.self.designall.visitor;

/**
 * @ClassName ConcreteElementA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    
    public void operation(){
        System.out.println("ConcreteElementA");
    }
}
