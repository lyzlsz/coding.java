package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/31
 **/
//方法引用
    //引用构造方法
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Person [name=" +name+",age="+age+"]";
    }
}
@FunctionalInterface
interface IUtil<R,PN,PA>{
    public R createPerson(PN p1,PA p2);
}
public class Test4 {
    public static void main(String[] args) {
        IUtil <Person,String,Integer> iu=Person :: new ;
        System.out.println(iu.createPerson("jack",25)); //相当于调用Person类的构造方法
    }
}
