package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:快速排序
 * Creat:2019/4/27
 **/
public class QuickSort {

    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    //Hover法做partition操作
    private static int  partition1(int[] array,int left,int right){
        int begin = left;
        int end = right;
        int pivot = array[right];
        while(begin < end){
            while( begin < end && array[begin] <= pivot){
                begin++;  //当前数比基准值小,就往后遍历,遇到比基准值大的数才停下来
            }
            while(begin < end && array[end] >= pivot){
                end--;    //当前数比基准值大,就往前遍历,遇到比基准值小的数才停下来
            }
            swap(array,begin,end); //否则,遍历无法继续,交换所指向的值,再继续遍历
        }
        swap(array,begin,right);  //遍历到最后begin == end,将right的值与begin的值交换
        return begin;             //此时,序列中基准值左边所有的值就比基准值小,右边的数就比基准值大

    }

    //用挖坑法做partition操作
    private static int partition2(int[] array,int left,int right){
        int begin = left;
        int end = right;
        int pivot = array[right];
        while(begin < end){
            while(begin < end && array[begin] <= pivot){
                begin++;   //当前数比基准值小,就往后遍历,遇到比基准值大的数才停下来
            }
            array[begin] = array[end];  //否则,将end的值赋给begin
            while(begin < end && array[begin] <= pivot){
                end--;    //当前数比基准值大,就往前遍历,遇到比基准值小的数才停下来
            }
            array[end] = array[begin]; //否则,将begin的值赋给end
        }
        array[begin] = pivot;  //最终begin == end时,将pivot的值赋给begin
        return begin;
    }

    //前后下标法做partition操作
    private static int parttiton3(int[] array,int left,int right){
        int d = left;
        for(int i = left;i<right;i++){
            if(array[i] < array[right]){
                swap(array,d,i);
                d++;
            }
        }
        swap(array,d,right);
        return d;
    }

    //取基准值的方法
    //1.取最边上的值(左右都可以)
    //2.随机取  random.nextIndex()
    //3.三数取中法(方法2,3选定基准值后,把基准值交换到最边上)

    //三数取中
    private static int medianofthree(int[] array,int left,int right) {
        int mid = left + (right - left) / 2;
        if (array[left] > array[right]) {
            if (array[left] < array[mid]) {
                return left;
            } else if (array[mid] > array[right]) {
                return mid;
            } else {
                return right;
            }
        } else {
            if (array[right] < array[mid]) {
                return right;
            } else if (array[mid] > array[left]) {
                return mid;
            } else {
                return left;
            }
        }
    }

    private static void quickSortInner(int[] array,int left,int right){
        if(left > right){
            //size == 1 已经有序
            return;
        }
        if(left == right){
            //size == 0
            return;
        }
        int originIndex = medianofthree(array,left,right);
        swap(array,originIndex,right);

        //要排序的区间是array[left,right]
        //1.找基准值 array[right]
        //2.遍历整个区间,把区间的为三部分
        int pivotIndex = partition1(array,left,right);
        //3.分治算法
        //用相同的方式处理两个小区间,直到size == 1 | size == 0
        //比基准值小的区间[left,pivotIndex-1]
        quickSortInner(array,left,pivotIndex-1);
        //比基准值大的区间[pivotIndex+1,right]
        quickSortInner(array,pivotIndex+1,right);
    }
    private static void  quickSort(int[] array){

        quickSortInner(array,0,array.length -1);
    }

    public static void main(String[] args) {
        int[] array = {9,3,1,5,4,2,7,6,8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
