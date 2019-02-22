package cn.zxf.self.designall.flyweight;

/**
 * @ClassName FlyweightTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class FlyweightTest {

    public static void main(String[] args){
         int extrinsicstate = 22;

         FlyweightFactory f = new FlyweightFactory();

         Flyweight fx = f.getFlyweight("x");
         fx.operation(--extrinsicstate);

         Flyweight fy = f.getFlyweight("y");
         fy.operation(--extrinsicstate);

         Flyweight fz = f.getFlyweight("z");
         fz.operation(--extrinsicstate);

         Flyweight uf = new UnsharedConcreteFlyweight();
         uf.operation(--extrinsicstate);

    }
}
