package cn.zxf.self.designall.builder;

/**
 * @ClassName BuilderTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class BuilderTest {
    public static void main(String[] args){

          Director director = new Director();
          Builder builder;
          Product product;
          builder = new ConcretBuilderA();
          director.construct(builder);
          product = builder.getResult();
          product.show();
          builder = new ConcretBuilderB();
          director.construct(builder);
          product = builder.getResult();
          product.show();

    }
}
