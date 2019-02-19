package cn.zxf.self.designall.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @ClassName DelegatorMap
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public class DelegatorMap extends  Delegator {
    private Map orginClass = null; //原始对象
    private Map proxyClass = null; //代理对象

    public DelegatorMap(){}
    public DelegatorMap(Object obj){
        super(obj);
        orginClass = (Map) obj;
        proxyClass = (Map) super.createProxy(orginClass);

    }

    public Map getOrginClass() {
        return orginClass;
    }

    public Map getProxyClass() {
        return proxyClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("size".equals(method.getName())){
            Object res =  new Integer(-1);
            System.out.println("调用委托方法");
            return res;
        }else {
            System.out.println("调用原始方法");
            return super.invoke(proxy, method, args);

        }
    }
}
