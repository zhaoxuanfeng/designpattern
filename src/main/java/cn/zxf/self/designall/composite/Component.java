package cn.zxf.self.designall.composite;

/**
 * @ClassName Component
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public abstract class Component {

     protected String name;

     public Component(String name){
         this.name = name;
     }

     public  abstract  void add(Component component);

     public  abstract  void remove(Component component);

     public  abstract   void display(int depth);

}
