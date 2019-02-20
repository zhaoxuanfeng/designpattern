package cn.zxf.self.designall.state;

/**
 * @ClassName Work
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class Work {
    WorkState   currentWorkState;
    private double hour;
    private boolean finish ;

    public Work(){
        currentWorkState = new ForenoonState();
        this.finish = false;
    }


    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(WorkState workState){
        this.currentWorkState = workState;
    }

    public void writeProgram(){
        currentWorkState.writeProgram(this);
    }




}
