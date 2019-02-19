package cn.zxf.self.designall.prototype;

/**
 * @ClassName PrototypeTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
         Prototype prototype = new ConcretePrototypeA("111");
         ConcretePrototypeA ca = (ConcretePrototypeA) prototype.clone();
         System.out.println(ca.getId());


         Resume a = new Resume("大鸟");
         a.setPersonalInfo("男","30");
         a.setWorkExperience("2001-2009","ali");
//         a.display();

         Resume b = (Resume) a.clone();
    //     b.setWorkExperience("2010-2015","baidu");
//         b.display();



         Resume c = (Resume) a.clone();
         c.setWorkExperience("2016-2019","tencent");
//         c.display();
         a.setWorkExperience("2001-2009","asiainfo");
         a.display();
         b.display();
         c.display();


         Resume_deep a_d = new Resume_deep("小菜");
         a_d.setPersonalInfo("男","21");
         a_d.setWorkExperience("2001-2002","111");

         Resume_deep b_d = (Resume_deep) a_d.clone();
         //  b_d.setWorkExperience("2003-2004","22000");


         Resume_deep c_d = (Resume_deep) a_d.clone();
         c_d.setWorkExperience("2005-2006","3333333333");
         a_d.setWorkExperience("2001-2002","4444");

         a_d.display();
         b_d.display();
         c_d.display();

    }
}
