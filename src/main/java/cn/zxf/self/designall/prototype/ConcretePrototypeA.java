package cn.zxf.self.designall.prototype;

/**
 * @ClassName ConcretePrototypeA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ConcretePrototypeA extends Prototype{
    public ConcretePrototypeA() {
    }
    public ConcretePrototypeA(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return this;
    }
}
