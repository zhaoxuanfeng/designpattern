package cn.zxf.self.designall.composite;

/**
 * @ClassName Leaf
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove a leaf");
    }

    @Override
    public void display(int depth) {
        int i ;
        String flag = "";
        for (i=0;i<depth;i++){
            flag = flag.concat("-");
        }
        System.out.println(flag+ name);

    }
}
