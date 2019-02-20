package cn.zxf.self.designall.Bridge;

/**
 * @ClassName Abstraction
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public  class Abstraction {

    protected IImplementor implementor;
    public void setImplementor(IImplementor implementor){
        this.implementor = implementor;
    }
    public  void operation(){
        implementor.operation();
    }

}
