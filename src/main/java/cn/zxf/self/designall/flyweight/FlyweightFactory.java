package cn.zxf.self.designall.flyweight;

import java.util.Hashtable;

/**
 * @ClassName FlyweightFactory
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class FlyweightFactory {

    private Hashtable flyweight = new Hashtable();


    public FlyweightFactory(){
        flyweight.put("x",new ConcreteFlyweight());
        flyweight.put("y",new ConcreteFlyweight());
        flyweight.put("z",new ConcreteFlyweight());

    }


    public Flyweight  getFlyweight(String key){
        return (Flyweight) flyweight.get(key);
    }


}
