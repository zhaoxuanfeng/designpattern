package cn.zxf.self.designall.flyweight;

/**
 * @ClassName ConcreteFlyweight
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight："+extrinsicstate);
    }
}
