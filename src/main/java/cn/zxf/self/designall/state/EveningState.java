package cn.zxf.self.designall.state;

/**
 * @ClassName EveningState
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class EveningState extends WorkState {
    @Override
    public void writeProgram(Work work) {
        if(work.isFinish()){
            work.setState(new RestState());
            work.writeProgram();
        }else {
            if(work.getHour()< 21){
                System.out.println("当前时间"+work.getHour()+"点，加班，疲惫");
            }else{
                work.setState(new SleepingState());
                work.writeProgram();
            }

        }
    }
}
