package cn.zxf.self.designall.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IteratorTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class IteratorTest {
public static void main(String[] args){

    List<Object> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("3");

    IIterator it = new ConcreteIterator(list);
    Object item = it.first();
    System.out.println(item.toString());
    while (!it.isDone()){
        System.out.println(it.next());
    }

}

}
