package cn.zxf.self.designall.visitor;

/**
 * @ClassName ConcreteVisitor
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class ConcreteVisitor implements  Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }
}
