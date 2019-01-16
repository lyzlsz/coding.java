package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/16
 **/

//反射与类操作--取得父类信息
    //取得父类包名称
//interface IFruit{}
interface IMessage{}
class CLS implements IFruit,IMessage {
    @Override
    public void eat() {
    }
}

public class TestReflect3 {
    public static void main(String[] args) {
        Class<?> cls =CLS.class;
        System.out.println(cls.getPackage().getName());
    }
}
