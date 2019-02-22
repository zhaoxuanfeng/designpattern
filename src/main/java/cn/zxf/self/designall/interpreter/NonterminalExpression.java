package cn.zxf.self.designall.interpreter;

/**
 * @ClassName NonterminalExpression
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class NonterminalExpression  implements  IAbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
