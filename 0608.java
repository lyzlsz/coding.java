package com.bittech;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/6/8 0008
 * @Author:weiwei
 **/
public class Main {
    public static void main(String [] args){
        long M = 0;
        long P = 0;
        for(int i =1;i <= 30;i++){
            M=M+10;
            P=P+(long)Math.pow(2,i-1);

        }
        System.out.println(M);
        System.out.println(P);
    }
}
