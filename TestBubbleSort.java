package com.bittech;
import java.util.Arrays;

/**
 * Author:weiwei
 * description:冒泡排序
 * Creat:2019/3/30
 **/
public class TestBubbleSort {

    public static int[] BubbleSort(int[] array) {
        int temp=0;
        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array.length -1-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] in ={5,2,7,9,1,8};
        System.out.println(Arrays.toString(BubbleSort(in)));
    }
}
