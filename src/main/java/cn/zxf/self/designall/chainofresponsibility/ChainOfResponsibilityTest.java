package cn.zxf.self.designall.chainofresponsibility;

/**
 * @ClassName ChainOfResponsibilityTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args){

        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[]  requests = {1,7,22,18,3};

        for (int re :
                requests) {
            handlerA.handleRequest(re);
        }


    }
}
