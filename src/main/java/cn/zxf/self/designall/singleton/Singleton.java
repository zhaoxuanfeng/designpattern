package cn.zxf.self.designall.singleton;

/**
 * @ClassName Singleton
 * @Description TODO  这里是懒汉模式
 * @Author zxf
 * @DATE 2019/2/20
 */
public class Singleton {

    private static Singleton instance ;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                    return  instance;
                }

            }

        }
        return instance;

    }
}
