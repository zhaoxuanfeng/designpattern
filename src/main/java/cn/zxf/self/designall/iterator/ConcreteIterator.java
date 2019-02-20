package cn.zxf.self.designall.iterator;

import java.util.List;

/**
 * @ClassName COncreteIterator
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ConcreteIterator implements IIterator {

    private List<Object> list = null;
    private  int  cur = 0;

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        return list.get(0);
    }

    @Override
    public Object next() {
        Object object = null;
        cur++;
        if (cur<list.size()){
            object = list.get(cur);
        }

        return object;
    }

    @Override
    public boolean isDone() {
        return cur > list.size()?true:false;
    }

    @Override
    public Object currentItem() {
        return list.get(cur);
    }
}
