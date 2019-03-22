package com.bittech;


/**
 * Author:weiwei
 * description:数组与方法互操作--方法返回数组
 * Creat:2019/3/21
 **/
public class TestReturn {
    public static void main(String[] args) {
        int[] data = init();
        printArray(data);
    }
    public static int[] init(){
        return new int[] {1,2,3,4,5};//匿名数组
    }
    public static void printArray(int[] temp){
        for(int i =0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
