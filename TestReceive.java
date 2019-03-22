package com.bittech;

/**
 * Author:weiwei
 * description:数组与方法互操作--方法接收数组
 * Creat:2019/3/21
 **/
public class TestReceive {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5};
        printArray(data);//等价于int[] temp = data;
    }
    public static void printArray(int[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
