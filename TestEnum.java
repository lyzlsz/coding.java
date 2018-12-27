package com.bittech;

import java.awt.*;

/**
 * Author:weiwei
 * Creat:2018/12/27
 **/
//枚举类
//enum Color{
//    RED,GREEN,BLUE
//}
//public class TestEnum {
//    public static void main(String[] args) {
//        for(Color temp :Color.values()){
//            System.out.println(temp.ordinal()+"="+temp.name());
//        }
//    }
//}


//在枚举中定义结构
//enum Color{
//    RED("红色"),GREEN("绿色"),BLUE("蓝色")  ;
//    private String title;
//    private Color(String title){    //构造方法私有化
//        this.title=title;
//    }
//    @Override
//    public String toString(){
//        return this.title;
//    }
//}
//public class TestEnum{
//    public static void main(String[] args) {
//        System.out.println(Color.BLUE);
//        System.out.println(Color.GREEN);
//        System.out.println(Color.RED);
//    }
//
//}


//枚举实现接口
//interface  IColor{
//    public String getColor();
//}
//enum Color implements IColor {
//    RED("红色"),GREEN("绿色"),BLUE("蓝色") ;
//    private String title;
//    private Color(String title) {   //构造方法私有化
//        this.title = title;
//    }
//    @Override
//    public String toString(){
//        return this.title;
//    }
//    @Override
//    public String getColor() {
//        return this.title;
//    }
//}
//public class TestEnum {
//    public static void main(String[] args) {
//        IColor iColor1 = Color.BLUE;
//        IColor iColor2 = Color.GREEN;
//        IColor iColor3 = Color.RED;
//        System.out.println(iColor1.getColor());
//        System.out.println(iColor2.getColor());
//        System.out.println(iColor3.getColor());
//    }
//}



//定义一个性别的枚举类
//enum Sex{
//    MALE("男"),FEMALE("女") ;
//    private String title;
//    private Sex(String title){
//        this.title=title;
//    }
//    @Override
//    public String toString(){
//        return this.title;
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    private Sex sex;
//    public Person(String name,int age,Sex sex){
//        super();
//        this.name=name;
//        this.age=age;
//        this.sex=sex;
//    }
//    @Override
//    public String toString(){
//        return "Person [name=" +name +",age="+age+",sex="+sex+"]";
//    }
//}
//public class TestEnum{
//    public static void main(String[] args) {
//        Person per1 = new Person("张三",20,Sex.MALE);
//        Person per2 = new Person("李四",21,Sex.FEMALE);
//        System.out.println(per1);
//        System.out.println(per2);
//    }
//}



//switch
enum Sex{
    MALE,FEMALE
}
public class TestEnum{
    public static void main(String[] args) {
        switch(Sex.MALE){
            case MALE:
                System.out.println("男人");
                break;
            case FEMALE:
                System.out.println("女人");
                break;
        }
    }
}