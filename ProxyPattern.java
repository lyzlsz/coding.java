package com.bittech.Design;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Author:weiwei
 * description:静态代理设计模式
 * Creat:20191/28
 **/

//interface ISubject{//核心操作接口
//    public void eat();//吃饭时核心业务
//     }
//class RealSubjecr  implements ISubject {
//
//    @Override
//    public void eat() {
//        System.out.println("饿了要吃饭");
//    }
//}
//class ProxySubject implements ISubject {
//    private ISubject subject;
//
//    public ProxySubject (ISubject subject ){
//        this.subject =subject;
//    }
//    public void prepare(){
//        System.out.println("饭前收拾食材");
//    }
//    public void afterEat(){
//        System.out.println("洗涮刷");
//    }
//
//    @Override
//    public void eat() {
//        this.prepare();
//        this.subject.eat();  //核心吃
//        this.afterEat();
//    }
//}
//class Factory{
//    private Factory(){}
//    public static <T> T getInstance(String className){
//        T t=null;
//        try{
//            t=(T) Class.forName(className).newInstance();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return t;
//    }
//    public static <T> T getInstance(String className,Object obj){
//        T t = null;
//        try{
//            Constructor <?> cons = Class.forName(className).
//                    getConstructor(obj.getClass().getInterfaces()[0]);
//            t = (T) cons.newInstance(obj);
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return t;
//    }
//}
//public class ProxyPattern {
//    public static void main(String[] args) {
//        ISubject subject =
//                Factory.getInstance("www.bit.java.ProxySubject",
//                        Factory.getInstance("www.bit.java.RealSubject"));
//        subject.eat();
//    }
//}
