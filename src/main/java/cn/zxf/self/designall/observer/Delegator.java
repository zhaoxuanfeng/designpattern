package cn.zxf.self.designall.observer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName EventHandler
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/19
 */
public abstract  class Delegator   implements InvocationHandler {

    protected Object object_orgin = null;
    protected Object object_proxy = null;

    public Delegator(){

    }

    public Delegator(Object obj){
        this.createProxy(obj);

    }

   /* public Object getObject_orgin() {
        return object_orgin;
    }

    public Object getObject_proxy() {
        return object_proxy;
    }*/

    protected  Object createProxy(Object obj){
        this.object_orgin = obj;
        //下面语句中orgin.getClass().getClassLoader()为加载器，orgin.getClass().getInterfaces()为接口集
        object_proxy = Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);

        return object_proxy;
    }


    protected Object invokeSuper(Method method,Object... args) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(object_orgin,args);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("toString" == method.getName()  ){
            return this.invokeSuper(method,args) + "$Proxy";
        }else {
            return invokeSuper(method,args);
        }
    }
}
