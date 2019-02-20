package cn.zxf.self.designall.chainofresponsibility;

/**
 * @ClassName HandlerB
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class HandlerB extends Handler {
    @Override
    void handleRequest(int request) {
        if(request >= 10  && request < 20){
            System.out.println("bbb处理请求"+request);
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
