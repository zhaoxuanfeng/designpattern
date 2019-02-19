package cn.zxf.self.designall.builder;

/**
 * @ClassName Builder
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public interface Builder {
    void buildPart();
    void buildPartA();
    void buildPartB();
    void buildPartC();

    Product getResult();

}
