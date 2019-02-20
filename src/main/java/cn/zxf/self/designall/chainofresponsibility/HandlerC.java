package cn.zxf.self.designall.chainofresponsibility;

/**
 * @ClassName HandlerC
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class HandlerC extends Handler {
    @Override
    void handleRequest(int request) {
        if(request >= 20  && request < 30){
            System.out.println("ccc处理请求"+request);
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
