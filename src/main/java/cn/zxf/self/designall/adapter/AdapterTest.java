package cn.zxf.self.designall.adapter;

/**
 * @ClassName AdapterTest
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class AdapterTest {
    public static void main(String[] args){

          Target target = new Adapter();
          Target target1 = new Target();
          target1.request();
          target.request();
    }
}
