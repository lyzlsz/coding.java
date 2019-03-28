package com.bittech;

/**
 * Author:weiwei
 * description:普通代码块
 * Creat:2019/3/26
 **/
public class Testcode1 {
    public static void main(String[] args) {
        {
            //直接使用{}定义,普通方法块
            int x = 10;
            System.out.println("x="+x);
        }
        int x = 10;
        System.out.println("x="+x);
    }
}
