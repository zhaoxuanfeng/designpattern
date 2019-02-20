package cn.zxf.self.designall.chainofresponsibility;

/**
 * @ClassName Handler
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public abstract  class Handler {
    protected String name;

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void handleRequest(int request);
}
