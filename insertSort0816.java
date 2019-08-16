package com;

import java.util.Arrays;

/**
 * package:com
 * Description:insertSort
 *
 * @date:2019/8/16
 * @Author:weiwei
 **/
public class insertSort {

    /**
     * 将数组分为有序区间[0,i)和无序区间[i,array.length)
     * 默认第一个数已经有序,从第二个数开始在有序区间查找位置去插入
     *
     * @param array
     * @return
     */
    private static int[] insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = i - 1; j >= 0 && array[i] < array[j]; j--) {
            }
            int pos = j + 1;
            int key = array[i];
            for (int k = i; k > pos; k--) {
                array[k] = array[k - 1];
            }
            array[pos] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 7, 2, 8, 5, 1, 3, 6};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
