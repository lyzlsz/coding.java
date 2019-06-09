package com.bittech;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/9
 * @Author:weiwei
 **/
public class Unpack {
    public static void main(String[] args) {
        int i =10;
        Integer j = 10;
        System.out.println(i == j); //true

        Integer z = null;
        System.out.println(j == z); //false
    }
}
