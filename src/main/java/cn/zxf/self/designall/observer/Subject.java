package cn.zxf.self.designall.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName ISubject  管理主题下对应的观察者
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class Subject {

    private List<IObserver> observers = new ArrayList<>();

    public  void attach(IObserver observer){
        observers.add(observer);
    }

    public  void  detach(IObserver observer){
        observers.remove(observer);
    }

    public  void notiify(){
        for (IObserver o:observers
             ) {
            o.update();

        }
    }



}
