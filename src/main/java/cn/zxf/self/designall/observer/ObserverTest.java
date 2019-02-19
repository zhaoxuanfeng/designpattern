package cn.zxf.self.designall.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ObserverTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class ObserverTest {

    public static void main(String[] args){

          ConcreteSubject s = new ConcreteSubject();
          s.attach(new ConcreteObserver(s,"x"));
          s.attach(new ConcreteObserver(s,"Y"));
          s.attach(new ConcreteObserver(s,"Z"));

          s.setSubjectState("ABC");
          s.notiify();


        DelegatorMap delegatorMap = new DelegatorMap(new HashMap<>());
        Map map = delegatorMap.getProxyClass();
        map.size();
        map.put("sss","zzz");
        System.out.println(map.get("sss"));

    }
}
