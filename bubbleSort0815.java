package com;

import java.util.Arrays;

/**
 * package:com
 * Description:bubbleSort
 * @date:2019/4/27
 * @Author:weiwei
 **/
public class bubbleSort {
    /**
     * 双层循环遍历数组
     * 第一层循环表示循环次数,一次循环解决一个数的问题,一共需要array.length次
     *       更优化的方式是array.length次(最后一个数不需要比较)
     * 第二层比较相邻两个数的大小,共需要array.length-2-i次(i是循环到哪个数,2是最后一个数不用比较
     *       下标从 0 开始,所以是减二
     * @param array
     * @return
     */
    private static int[] bubbleSort(int [] array){
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j <= array.length -2-i;j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {9,2,4,7,5,8,1,3,6};
        System.out.println(Arrays.toString(bubbleSort(array)));

    }
}
