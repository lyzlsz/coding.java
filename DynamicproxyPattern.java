package com.bittech.Design;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:weiwei
 * description:动态代理设计模式
 * Creat:2019/1/28
 **/

interface ISubject{//核心操作接口
    public void eat(String msg,int num);
}
class RealSubject implements ISubject{

    @Override
    public void eat(String msg, int num) {
        System.out.println("我要吃"+num+"分量的"+msg);
    }
}

/**
 * 动态代理类
 */
class ProxySubject implements InvocationHandler  {
    //绑定任意接口的对象,用Object描述
    private Object target;

    /**
     * 实现真实对象的绑定处理,及代理对象的输出
     * @param target
     * @return 返回一个代理对象(这个对象是根据接口定义动态创建生成的代理对象)
     */
    public Object  bind(Object target){
        //保存真实的对象
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    public void preHandle(){
        System.out.println("[ProxySubject]方法处理前");
    }
    public void afterHandle(){
        System.out.println("[ProxySubject]方法处理后");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.preHandle();
        //反射调用方法
        Object ret =method.invoke(this.target,args);
        this.afterHandle();
        return ret;
    }
}

public class DynamicproxyPattern {
    public static void main(String[] args) {
        ISubject subject =(ISubject) new ProxySubject().bind(new RealSubject());
        subject.eat("宫爆鸡丁",20);
    }
}
