package cn.zxf.self.designall.flyweight;

/**
 * @ClassName UnsharedConcreteFlyweight
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class UnsharedConcreteFlyweight  implements  Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享具体Flyweight:"+extrinsicstate);
    }
}
