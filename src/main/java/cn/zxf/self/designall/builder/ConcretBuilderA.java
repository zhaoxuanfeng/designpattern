package cn.zxf.self.designall.builder;

/**
 * @ClassName ConcretBuilder
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class ConcretBuilderA implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart() {
        product.add("装配部件");
    }

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public void buildPartC() {
        product.add("部件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
