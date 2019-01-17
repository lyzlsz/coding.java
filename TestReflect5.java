package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/16
 **/

//通过class实例化对象
// class Person{
//     private String name;
//     private int age;
//     public Person(String name,int age){
//         this.name =name;
//         this.age =age;
//     }
//     @Override
//    public String toString(){
//         return "Person [name=" + name + ", age"+age+"]";
//     }
//}
public class TestReflect5 {
    public static void main(String[] args) throws InstantiationException,
    IllegalAccessException {
        Class<?> cls=Person.class;
        System.out.println(cls.newInstance());
    }
}
