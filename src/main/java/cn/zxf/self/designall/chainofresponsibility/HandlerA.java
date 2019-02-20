package cn.zxf.self.designall.chainofresponsibility;

/**
 * @ClassName HandlerA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class HandlerA extends Handler {
    @Override
    void handleRequest(int request) {
        if(request > 0 && request < 10){
            System.out.println("aaa处理请求"+request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
