package cn.zxf.self.designall.composite;

/**
 * @ClassName HRDepartment
 * @Description TODO  树叶节点
 * @Author zxf
 * @DATE 2019/2/20
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(depth+"---"+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"HR职责！");
    }
}
