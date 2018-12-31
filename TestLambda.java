package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/31
 **/
//Lambda表达式
//    //函数式编程
// interface IMessage{
//     public void print();
//}
//public class TestLambda {
//     public static void main(String[] args) {
//        //函数式编程目的还是输出一句话
//        IMessage message = () -> System.out.println("Hello world");
//        message.print();
//    }
//}



//Lambda表达式单行语句
//functionalInterface注解,只允许有一个方法
//@FunctionalInterface
//interface IMessage{
//    public void print();
//}
//public class TestLambda{
//    public static void main(String[] args) {
//        IMessage message = () -> System.out.println("Hello world");
//        message.print();
//    }
//}


//Lambda 表达式多行语句
@FunctionalInterface
interface IMessage{
    public void print();
}
public class TestLambda{
    public static void main(String[] args) {
        IMessage message = () ->{
            System.out.println("java");
            System.out.println("PHP");
            System.out.println("C++");
            System.out.println("C");
        };
        message.print();
    }
}