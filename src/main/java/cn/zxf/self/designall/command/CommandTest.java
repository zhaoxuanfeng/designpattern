package cn.zxf.self.designall.command;

/**
 * @ClassName CommandTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class CommandTest {
    public static void main(String[] args){

          Receiver receiver = new Receiver();
          Command command = new ConcreteCommand(receiver);
          Invoker invoker = new Invoker();
          invoker.setCommand(command);
          invoker.executeCommand();

          Waiter waiter = new Waiter();
          waiter.setOrder(command);
          waiter.notifyCommond();
          waiter.cancelOrder(command);


    }

}
