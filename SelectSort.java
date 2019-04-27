package com.bittech;

/**
 * Author:weiwei
 * description:直接选择排序
 * Creat:2019/4/25
 **/
public class SelectSort {

    private static void SelectSortRecursion(int[] array, int size) {
        if (size <= 1) {
            return;
        }
        int max = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (array[j] > array[max]) {
                max = j;
            }
        }
        int t = array[max];
        array[max] = array[size - 1];
        array[size - 1] = t;

        SelectSortRecursion(array, size - 1);

    }

    private static void SelectSort(int[] array) {
        //每次选择一个最大的放到最后,最多选择n或n-1次
        //有序区间[i,length)
        //无序区间[0,i)
        //每次从无序区间选择最大的放到无序区间的最后面,无序区间越来越小,有序区间越来越大
        for (int i = 0; i < array.length; i++) {
            //无序区间[0,array.length-i);
            //有序区间[array.length-i,array.length);
            //在无序区间找出一个最大的数,找出下标
            int max = 0;//最大数的下标
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            //array[max]就是最大的数,把最大的数放到无序区间的最后一个
            int t = array[max];
            array[max] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
    }
    private static void SelectSort2(int[] array){
        for(int i = 0;i<array.length;i++){
            int min = i;//记录最终最小数所在的下标
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array ={
                9,3,5,2,7,3,1,8
        };

    }
}

