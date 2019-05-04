package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:归并排序(递归方式)
 * Creat:2019/4/27
 **/
public class MergeSort {
    private static void merge(int[] array,int low,int mid,int high,int[] extra){
        int i = low;  //遍历[low,mid]
        int j = mid;  //遍历[mid,high]
        int x = 0;    //遍历extra

        while(i < mid && j < high){
             if(array[i] <= array[j]){
                 extra[x++] = array[i++];
             }else{
                 extra[x++] = array[j++];
             }
        }
        while(i < mid){
            extra[x++] = array[i++];
        }
        while(j < high){
            extra[x++] = array[j++];
        }
        for(int k = low;k < high;k++){
            array[k] = extra[k - low];
        }
    }
    private static void mergeSortInner(int[] array,int low,int high,int[] extra){
        if (low == high - 1){
            return;
        }
        if(low >= high){
            return;
        }

        //平均切分
        int mid = low + (low - high)/2;
        //[low,mid)+[mid,high)
        //2.分治算法处理两个小区间
        mergeSortInner(array,low,mid,extra);
        mergeSortInner(array,mid,high,extra);

        //左右两个小区间已经有序了
        merge(array,low,mid,high,extra);
    }

    private static void mergeSort(int[] array) {
        int[] extra = new int [array.length];//设定长度,避免造成空间浪费
        mergeSortInner(array,0,array.length,extra);
    }
//
//    //非递归方式
//    private static void mergeNoR(int[] array){
//        int[] extra = new int [array.length];
//        for(int i = 1;i<array.length;i *= 2){
//            for(int j =0;j<array.length;j +=2 * i){
//                int low = j;
//                int mid = low + i;
//                if( mid >= array.length){
//                    continue;
//                }
//                int high = mid + i;
//                if(high > array.length){
//                    high = array.length;
//                }
//                merge(array,low,mid,high,extra);
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] array1 = {9,3,1,5,4,2,7,6,8};
        //int[] array2 = {8,3,1,2,5,3,7,6,2};
        mergeSort(array1);
        //mergeNoR(array2);
        System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));
    }
}
