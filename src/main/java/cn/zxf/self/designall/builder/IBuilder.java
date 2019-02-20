package cn.zxf.self.designall.builder;

/**
 * @ClassName IBuilder
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public interface IBuilder {
    void buildPart();
    void buildPartA();
    void buildPartB();
    void buildPartC();

    Product getResult();

}
