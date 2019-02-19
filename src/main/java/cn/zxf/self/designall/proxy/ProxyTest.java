package cn.zxf.self.designall.proxy;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/15
 */
public class ProxyTest {

    public static void main(String[] args){
         SchoolGirl girl = new SchoolGirl();
         girl.setName("xueke");

         ProxyPeople people = new ProxyPeople(girl);
         people.giveChocolate();
         people.giveDolls();
         people.giveFlowers();


         Proxy proxy  = new Proxy();
         proxy.request();


    }
}
