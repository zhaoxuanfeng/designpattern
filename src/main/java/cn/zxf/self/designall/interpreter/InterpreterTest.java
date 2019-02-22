package cn.zxf.self.designall.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName InterpreterTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/22
 */
public class InterpreterTest {


    public static void main(String[] args){

        Context context = new Context();
        List<IAbstractExpression> abstractExpressionList = new ArrayList<>();
        abstractExpressionList.add(new TerminalExpression());
        abstractExpressionList.add(new NonterminalExpression());
        abstractExpressionList.add(new TerminalExpression());
        abstractExpressionList.add(new TerminalExpression());

        for (IAbstractExpression ab:abstractExpressionList
             ) {
            ab.interpret(context);
        }

    }
}
