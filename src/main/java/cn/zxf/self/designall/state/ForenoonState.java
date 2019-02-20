package cn.zxf.self.designall.state;

/**
 * @ClassName ForenoonState
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class ForenoonState extends WorkState {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()< 12){
            System.out.println("当前时间"+work.getHour()+"点，上午工作精神百倍！");
        }else{
            work.setState(new NoonState());
            work.writeProgram();

        }
    }
}
