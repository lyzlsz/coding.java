package com.bittech;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Author:weiwei
 * Creat:2019/1/3
 **/
//内建函数式接口
public class TestInterface2 {
    //功能型接口
//功能型指的是你输入一个数据,而后将数据处理后输出
    public static void code1(){
        Function<Integer, String> fun = String::valueOf;
        System.out.println(fun.apply(1000));
    }
    public static void code2(){
        //供给型接口
        Supplier <String> sup = "hello" :: toUpperCase;
        System.out.println(sup.get());
    }
    public static void code3(){
        //消费型接口(不需要返回值)
        Consumer<String> cons = System.out :: println;
        cons.accept("嘿嘿嘿");
    }
    public static void code4(){
        //断言型接口(返回值为布尔)
        Predicate<String> pre = "###123Hello" :: startsWith;
        System.out.println(pre.test("###"));
        System.out.println(pre.test("Hello"));
    }
    public static void main(String[] args) {
    }
}
