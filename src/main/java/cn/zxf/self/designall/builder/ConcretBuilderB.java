package cn.zxf.self.designall.builder;

/**
 * @ClassName ConcretBuilderB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class ConcretBuilderB implements Builder {

   private Product product = new Product();
    @Override
    public void buildPart() {
        product.add("拆卸线");
    }

    @Override
    public void buildPartA() {
        product.add("拆卸A");
    }

    @Override
    public void buildPartB() {
        product.add("拆卸B");
    }

    @Override
    public void buildPartC() {
        product.add("拆卸C");
    }

    @Override
    public Product getResult() {
        return product;
    }

}
