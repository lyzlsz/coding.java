package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:汉诺塔问题
 * @date:2019/5/14
 * @Author:weiwei
 **/
public class Hannoi {
    public static void main(String[] args) {
        System.out.println("请输入要移动的块数: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        move(n,'a','b','c');
    }
    public static void move(int n,char a,char b,char c){
        if(n == 1){//当只有一个的时候直接从a移动到c
            System.out.println("请输入要移动的块数: ");
        }else{
            move(n-1,a,c,b);
            System.out.println(a+"-->"+c);
            move(n-1,b,a,c);//第n-1个移动过来之后b变开始盘，b通过a移动到c
        }
    }
}
