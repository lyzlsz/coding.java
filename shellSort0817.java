package com;

import java.util.Arrays;

/**
 * package:com
 * Description:shellSort
 * @date:2019/8/17
 * @Author:weiwei
 **/
public class shellSort{

    /**
     * 分组插排,插排的优化
     * 分的组越多,走的步伐越大
     * @param array
     */

    private static void insertWithGap(int[] array,int gap){
        for(int i =0;i<array.length;i++){
            int key = array[i];
            int j = i-gap;
            for(;j >=0 && key <array[j];j=j-gap){
                array[j + gap] = array[j];
            }
            array[j + gap] = key;
        }
    }
    private static void shellSort(int [] array){
        int gap = array.length;
        while(true){
            gap = (gap/3)+1;
            insertWithGap(array,gap);

            if(gap == 1){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,3,5,2,8,7,1,4,6};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
