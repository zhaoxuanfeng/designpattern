package cn.zxf.self.designall.facade;

/**
 * @ClassName Facade
 * @Description TODO  外观模式
 * @Author zxf
 * @DATE 2019/2/18
 */
public class Facade {

    SubSystemOne subSystemOne ;
    SubSystemTwo subSystemTwo ;
    SubSystemThree subSystemThree ;
    SubSystemFour subSystemFour ;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();

    }

    public void methodA(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }

    public  void methodB(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }

}
