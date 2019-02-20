package cn.zxf.self.designall.builder;

/**
 * @ClassName Director
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class Director {
    public void construct(IBuilder builder){
        builder.buildPart();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

    }
}
