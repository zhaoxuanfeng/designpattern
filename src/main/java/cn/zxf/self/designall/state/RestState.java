package cn.zxf.self.designall.state;

/**
 * @ClassName RestState
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class RestState extends WorkState {
    @Override
    public void writeProgram(Work work) {
        System.out.println("下班睡觉");
    }
}
