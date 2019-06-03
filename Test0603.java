package com.bittech;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/3
 * @Author:weiwei
 **/
public class Test0603 {
    public void add(Byte b){
        b =b++;
    }
    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(a++);
        System.out.println(a+" ");
        add(b++);
        System.out.println(b+" ");
    }

    public static void main(String[] args) {
        System.out.println();

    }
}
