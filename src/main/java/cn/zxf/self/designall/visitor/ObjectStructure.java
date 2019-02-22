package cn.zxf.self.designall.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element e:elements
             ) {
            e.accept(visitor);
        }
    }

}
