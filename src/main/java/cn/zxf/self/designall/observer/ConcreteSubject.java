package cn.zxf.self.designall.observer;

/**
 * @ClassName ConcreteSubject
 * @Description TODO  具体主题
 * @Author zxf
 * @DATE 2019/2/18
 */
public class ConcreteSubject  extends  Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
