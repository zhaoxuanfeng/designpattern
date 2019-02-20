package cn.zxf.self.designall.composite;

/**
 * @ClassName Company
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public abstract class Company {

    protected String name;

    public Company(String name){

        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int depth);
    /***
        *@Description  //TODO  履行职责
        *@Param []
        *@Return  void
     **/
    public abstract void lineOfDuty();

}
