package cn.zxf.self.designall.state;

/**
 * @ClassName SleepingState
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class SleepingState extends WorkState {
    @Override
    public void writeProgram(Work work) {

            System.out.println("当前时间"+work.getHour()+"点，睡着了！");
    }
}
