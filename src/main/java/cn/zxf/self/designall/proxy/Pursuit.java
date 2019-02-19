package cn.zxf.self.designall.proxy;

/**
 * @ClassName Pursuit
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class Pursuit implements IGiveGift {

    private  SchoolGirl mm;

    public Pursuit( SchoolGirl mm){
        this.mm = mm;
    }
    
    
    @Override
    public void giveDolls() {
        System.out.println("送洋娃娃！");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送鲜花！");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送巧克力!");
    }
}
