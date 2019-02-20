package cn.zxf.self.designall.composite;

/**
 * @ClassName FinanceDepartment
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class FinanceDepartment extends Company {
    
    public FinanceDepartment(String name) {
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
        System.out.println(name+"财务部职责");
    }
}
