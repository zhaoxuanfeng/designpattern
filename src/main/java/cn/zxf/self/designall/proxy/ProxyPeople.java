package cn.zxf.self.designall.proxy;

/**
 * @ClassName ProxyPeople
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ProxyPeople implements IGiveGift {
    Pursuit pursuit;

    public ProxyPeople(SchoolGirl mm){
        pursuit = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
