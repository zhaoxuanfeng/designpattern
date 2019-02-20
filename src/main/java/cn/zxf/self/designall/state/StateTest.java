package cn.zxf.self.designall.state;

/**
 * @ClassName StateTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class StateTest {
    public static void main(String[] args){

        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
        context.request();
        context.request();


        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(17);
//        emergencyProjects.setFinish(true);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(19);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.writeProgram();
    }
}
