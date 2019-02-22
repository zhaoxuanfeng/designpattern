package cn.zxf.self.designall.interpreter;

/**
 * @ClassName TerminalExpression
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class TerminalExpression implements IAbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
