package com.bittech;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class C3_11 {
    public static void main(String[] args){
        int f1=1,f2=1;
        for(int i=1;i<19;i++){
            System.out.print("\t"+f1+"\t"+f2);
            if(i%2==0) {
                System.out.println("\n");
            }
            f1=f1+f2;
            f2=f2+f1;
        }
    }
}
