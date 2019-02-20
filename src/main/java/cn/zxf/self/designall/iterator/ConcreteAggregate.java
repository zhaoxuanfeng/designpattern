package cn.zxf.self.designall.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteAggregate
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteAggregate implements IAggregate {

    private List<Object>  list = new ArrayList<>();

    private int size = 0;

    private int index = 0;

    public ConcreteAggregate(){
                index=0;
                size=0;

    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public int getSize() {
        return list.size();
    }



    public int getIndex(Object object) {
        return  list.indexOf(object);
    }



    @Override
    public IIterator createIteratorInterface() {
        return new ConcreteIterator(list);
    }


}
