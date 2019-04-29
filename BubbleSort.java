package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:冒泡排序
 * Creat:2019/4/27
 **/
public class BubbleSort {

    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;

    }
    private static int[] BubbleSort(int[] array){
        for(int i = 0;i<array.length;i++){
            boolean isSorted = true;
            //最小的数冒泡到最前面,需要从后往前冒泡
            //有序[0,i)
            //无序[i,length)
            for(int j = array.length -1;j>i;j--){
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);//交换
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7,9,2,6,3,8,4,1,5};
        System.out.println(Arrays.toString(BubbleSort(array)));
    }
}
