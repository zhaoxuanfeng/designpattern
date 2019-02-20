package cn.zxf.self.designall.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteCompany
 * @Description TODO  树枝节点
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteCompany extends Company {

    private List<Company>  childern = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childern.add(company);
    }

    @Override
    public void remove(Company company) {
        childern.remove(company);
    }

    @Override
    public void display(int depth) {

        System.out.println(depth+name);
        for (Company c:childern) {
            c.display(depth+1);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company c:childern) {
            c.lineOfDuty();
        }
    }
}
