package cn.zxf.self.designall.state;

/**
 * @ClassName NoonState
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class NoonState extends WorkState {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()< 13){
            System.out.println("当前时间"+work.getHour()+"点，饿了，午饭犯困；午休");
        }else{
            work.setState(new AfternoonState());
        }
    }
}
