package cn.zxf.self.designall.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Composite
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Composite  extends  Component{


    private List<Component> children = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        int i ;
        String flag = "";
        for (i=0;i<depth;i++){
             flag = flag.concat("-");
        }
        System.out.println(flag+ name);


        for (Component c : children) {
            c.display(depth+2);
        }
    }
}
