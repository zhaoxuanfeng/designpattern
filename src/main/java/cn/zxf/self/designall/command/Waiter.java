package cn.zxf.self.designall.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Waiter
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class Waiter  {
    private List<Command> commandList = new ArrayList<>();

    public void setOrder(Command command){
        if ("命令模式.bakeChickenWingCommand"== command.toString()){
            System.out.println("鸡翅没了");
        }else{
            commandList.add(command);
            System.out.println("增加订单，"+command.toString());
        }

    }
    
    public void cancelOrder(Command command){
        commandList.remove(command);
        System.out.println("取消订单：");
    }

    public void notifyCommond(){
        for (Command c:commandList
             ) {
            c.execute();
        }
    }
}
