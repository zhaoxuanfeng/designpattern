package cn.zxf.self.designall.prototype;

/**
 * @ClassName Work
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class Work  implements  Cloneable{

    private String timeArea;
    private String company;

    public String getTimeArea() {

        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
