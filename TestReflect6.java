package com.bittech;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Author:weiwei
 * Creat:2019/1/16
 **/
//反射调用构造
//通过Constructor实例化对象
//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name =name;
//        this.age =age;
//    }
//    @Override
//    public String toString(){
//        return "Person [name=" + name + ", age"+age+"]";
//    }
//}
//public class TestReflect6 {
//    public static void main(String[] args)throws InstantiationException,
//            IllegalAccessException, NoSuchMethodException, SecurityException,
//            IllegalArgumentException, InvocationTargetException {
//        Class<?> cls = Person.class ;
//        // 取得指定参数类型的构造方法对象
//        Constructor<?> cons = cls.getConstructor(String.class,int.class) ;
//        System.out.println(cons.newInstance("yuisama",29));
//    }
//}
