package cn.zxf.self.designall.state;

/**
 * @ClassName AfternoonState
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class AfternoonState extends WorkState {


    @Override
    public void writeProgram(Work work) {
        if(work.getHour()< 12){
            System.out.println("当前时间"+work.getHour()+"点，下午状态不错，继续努力！");
        }else{
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
