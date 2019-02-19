package cn.zxf.self.designall.prototype;

/**
 * @ClassName Prototype
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public abstract class Prototype {

    private  String id;
    public Prototype(){

    }
    public Prototype(String id){
        this.id = id;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Prototype clone();
}
