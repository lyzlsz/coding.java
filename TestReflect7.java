package com.bittech;

import java.lang.reflect.Method;

/**
 * Author:weiwei
 * Creat:2019/1/16
 **/
//反射调用普通方法
//取的一个类中全部普通方法
 class Person{
     private String name;
     private int age;
     public Person(){}
     public Person(String name,int age){
         this.name =name;
         this.age =age;
     }
     @Override
    public String toString(){
         return "Person [name=" + name + ", age"+age+"]";
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class TestReflect7 {
    public static void main(String[] args) {
        Class<?> cls = Person.class;
        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }
    }
}
