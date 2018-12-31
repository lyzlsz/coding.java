package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/31
 **/
//接口定义加强
//用default定义普通方法
//interface IMessage{
//    public default void fun(){
//        System.out.println("Hello IMessage");
//    }
//    public void print();
//}
//class MessageImpl implements IMessage {
//    @Override
//    public void print() {
//        System.out.println("Hello MessageImpl");
//    }
//}
//public class TestInterface1 {
//    public static void main(String[] args) {
//        IMessage message = new MessageImpl();
//        message.fun();
//        message.print();
//    }
//}

//定义static 静态方法
//interface IMessage{
//    public default void fun(){
//        System.out.println("Hello IMessage");
//    }
//    public static IMessage getInstance(){
//        return  new MessageImpl();
//    }
//    public void print();
//}
//class MessageImpl implements IMessage{
//    @Override
//    public void print() {
//        System.out.println("Hello MessageImpl");
//    }
//}
//public class TestInterface1{
//    public static void main(String[] args) {
//        IMessage message = IMessage.getInstance();
//        System.out.println(message);
//        message.print();
//        message.fun();
//    }
//}
//接口定义加强不属于标准设计,属于挽救设计