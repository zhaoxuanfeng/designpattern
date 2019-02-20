package cn.zxf.self.designall.Bridge;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public abstract class Phone {
    protected  ISoftware software;


    public void setSoftware(ISoftware software){
        this.software = software;
    }

    public abstract  void run();
}
