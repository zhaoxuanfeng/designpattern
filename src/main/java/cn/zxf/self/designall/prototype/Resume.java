package cn.zxf.self.designall.prototype;

/**
 * @ClassName Resume
 * @Description TODO  浅复制实现的原型模式????：只能复制值类型而不能复制引用类型,Cloneable的clone方法实现的是深度复制。
 * @Author zxf
 * @DATE 2019/2/15
 */
public class Resume  implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name){
        this.name = name;
    }

    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea,String company){
        this.company = company;
        this.timeArea = timeArea;
    }

    public void display(){
        System.out.println(name+"   "+sex+"   "+age);
        System.out.println("工作经历："+timeArea+"  "+company);
    }

    public Object clone() throws CloneNotSupportedException {



        return super.clone();
//            return this.clone();  //出现异常
    }


}
