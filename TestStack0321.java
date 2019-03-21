package com.bittech;

/**
 * Author:weiwei
 * description:多个栈内存指向堆内存
 * Creat:2019/3/21
 **/
public class TestStack0321 {
    public static void main(String[] args) {
        int []  x = null;
        int [] temp=null;//声明对象
        x = new int[3];//定义长度
        System.out.println(x.length);
        x[0] = 10;//第一个元素
        x[1] = 20;
        x[2] = 30;
        for(int i = 0;i<x.length;i++){
            System.out.println(x[1]);//通过循环控制索引下标更改
        }
        temp=x;//引用传递,不出现[]
        temp[0]=55;//更改值
        System.out.println(x[0]);
    }
}
