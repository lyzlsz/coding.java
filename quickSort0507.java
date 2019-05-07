package Reviews;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/7
 **/
public class quickSort {

    private static void  swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static int partition(int[] array,int left,int right){
        //找到基准值
        //遍历区间,分为两个子区间
        //分治算法处理两个区间
        int begin = left;
        int end = right;
        int pivot = array[right];
        while(begin < end){
            while(begin < end && array[begin] <= pivot){
                begin++;
            }
            while(begin < end && array[end] >= pivot){
                end--;
            }
            swap(array,begin,end);
        }
        swap(array,begin,right);
        return begin;
    }
    private static void quickInner(int[] array,int left,int right){
        if(left > right){
            return;
        }
        if(left == right){
            return;
        }
        int pivotIndex = partition(array,left,right);
        quickInner(array,left,pivotIndex-1);
        quickInner(array,pivotIndex+1,right);
    }
    private static void quickSort(int[] array){
        quickInner(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {9,3,1,5,4,2,7,6,8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
