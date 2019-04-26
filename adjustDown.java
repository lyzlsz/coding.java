package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/26
 **/
public class adjustDown {

    /**
     * 向下调整(小堆)
     *向下调整考虑左右两个孩子结点
     * @param array
     * @param size
     * @param index
     */
    private static void adjustDown(int[] array, int size, int index) {
        int min = 2 * index + 1;
        while (min < size) {
            if (min + 1 < size && array[min + 1] < array[min]) {
                min += 1;
            }

            if(array[index] <= array[min]){
                break;    //如果下标小于最小值,就不需要调整了,break
            }

            //向下调整,交换
            int t = array[min];
            array[min] = array[index];
            array[index] = t;

            index = min;
            min = 2* index+1;
        }
    }
}
