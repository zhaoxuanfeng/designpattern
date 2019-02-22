package cn.zxf.self.designall.visitor;

/**
 * @ClassName VisitorTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class VisitorTest {
    public static void main(String[] args){
         ObjectStructure objectStructure  = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        Visitor v1 = new ConcreteVisitor();
        Visitor v2 = new ConcreteVisitor2();

        objectStructure.accept(v1);
        objectStructure.accept(v2);



    }
}
