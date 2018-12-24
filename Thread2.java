package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/22
 **/

//实现Runnable接口的两种方法
    //1.继续实现接口
    //2.函数式编程
//对于Runnable接口的对象可以采用匿名内部类或者Lambda表达式来定义
public class Thread2 {
    //利用匿名内部类进行Runnable对象的创建
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world");
//            }
//        }).start();
      //利用Lambda 表达式进行Runnable对象的创建
      Runnable runnable = () -> System.out.println("Hello world");
      new Thread(runnable).start();
    }
}
