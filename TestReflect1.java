package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/16
 **/
//反射实例化对象
public class TestReflect1 {
    public static void main(String[] args) throws ClassNotFoundException,
    InstantiationException ,IllegalAccessException {
        Class<?> cls = Class.forName("java.util,Date");
        Object obj=cls.newInstance();//实例化对象,相当于 new java.util.Date();
        System.out.println(obj);
    }
}
