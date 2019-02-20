package cn.zxf.self.designall.iterator;

/**
 * @ClassName IIterator
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/20
 */
public interface IIterator {
    Object first();
    Object next();
    boolean  isDone();
    Object currentItem();
}
