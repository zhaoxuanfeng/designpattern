package cn.zxf.self.designall.composite;

/**
 * @ClassName CompositeTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class CompositeTest {
    public static void main(String[] args){
        Composite root = new Composite("root");
        root.add(new Leaf("leaf_a"));
        root.add(new Leaf("leaf_b"));

        Composite comp = new Composite("X");
        comp.add(new Leaf("X_A"));
        comp.add(new Leaf("X_B"));

        root.add(comp);

        Composite comp2 = new Composite("XY");
        comp2.add(new Leaf("XY_A"));
        comp2.add(new Leaf("XY_B"));
        comp.add(comp2);

        root.add(new Leaf("leaf_c"));

        Leaf leaf = new Leaf("leaf_d");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);


        System.out.println("-----------------------------------------");

        ConcreteCompany rootCom = new ConcreteCompany("北京总公司");
        rootCom.add(new HRDepartment("总公司人力资源部"));
        rootCom.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp1 = new ConcreteCompany("上海华东总公司");
        comp1.add(new HRDepartment("华东总公司人力资源部"));
        comp1.add(new FinanceDepartment("华东总公司财务部"));
        rootCom.add(comp1);

        ConcreteCompany comp4 = new ConcreteCompany("南京办事处");
        comp4.add(new HRDepartment("南京人力资源部"));
        comp4.add(new FinanceDepartment("南京财务部"));
        comp1.add(comp4);

        rootCom.display(1);

        rootCom.lineOfDuty();


    }
}
