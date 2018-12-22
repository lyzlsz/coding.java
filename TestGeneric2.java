package com.bittech;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
//泛型接口
//在子类定义时使用泛型
interface IMessage <T>{  //在接口上定义了泛型
    public void print(T t);
}
class MessageImpl<T> implements IMessage<T>{

    @Override
    public void print(T t) {
        System.out.println(t);
    }
}
public class TestGeneric2 {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl();
        msg.print("Hello world");
    }
}
