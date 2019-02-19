package cn.zxf.self.designall.prototype;

/**
 * @ClassName Resume_deep
 * @Description TODO  深复制实现的原型模式，实现复制引用类型
 * @Author zxf
 * @DATE 2019/2/15
 */
public class Resume_deep implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private Work work;

    public Resume_deep(String name){
        this.name = name;
    }

    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea,String company){
        Work work1 = new Work();
        work1.setCompany(company);
        work1.setTimeArea(timeArea);
        work = work1;
    }

    public void display(){
        System.out.println(name+"   "+sex+"   "+age);
        System.out.println("工作经历："+work.getTimeArea()+"  "+work.getCompany());
    }

    public Object clone() throws CloneNotSupportedException {
        Resume_deep resume_deep = (Resume_deep) super.clone();
        resume_deep.work = (Work) work.clone();
        return resume_deep;
//            return this.clone();  //出现异常
    }


}
