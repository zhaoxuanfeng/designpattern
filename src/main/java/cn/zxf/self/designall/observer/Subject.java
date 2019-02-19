package cn.zxf.self.designall.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName Subject  管理主题下对应的观察者
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public  void attach(Observer  observer){
        observers.add(observer);
    }

    public  void  detach(Observer observer){
        observers.remove(observer);
    }

    public  void notiify(){
        for (Observer o:observers
             ) {
            o.update();

        }
    }



}
