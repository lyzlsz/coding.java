package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/3/21
 **/
public class Test0321 {
    public static void main(String[] args) {
       int line = 10;
       for(int x = 0;x<line;x++){
           for(int y= 0;y<line-x;y++){
               System.out.print(" ");
           }
           for(int z = 0;z < x;z++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
