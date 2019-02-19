package cn.zxf.self.designall.observer;

/**
 * @ClassName ConcreteObserver
 * @Description TODO   具体观察者
 * @Author zxf
 * @DATE 2019/2/18
 */
public class ConcreteObserver implements Observer {

    private  String name;

    private String observerState;

    private  ConcreteSubject concreteSubject;

    public ConcreteObserver(){}

    public ConcreteObserver(ConcreteSubject concreteSubject,String name){
        this.concreteSubject = concreteSubject;
        this.name = name;
    }



    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }


    @Override
    public void update() {
        observerState = concreteSubject.getSubjectState();
        System.out.println("观察者"+name+"新状态为："+observerState);
    }


}
