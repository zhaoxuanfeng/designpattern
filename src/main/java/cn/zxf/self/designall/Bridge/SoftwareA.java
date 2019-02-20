package cn.zxf.self.designall.Bridge;

/**
 * @ClassName SoftwareA
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public class SoftwareA implements ISoftware {
    @Override
    public void run() {
        System.out.println("播放MP3");
    }
}
