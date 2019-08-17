package com;

import java.util.Arrays;

/**
 * package:com
 * Description:TODO
 * @date:2019/8/17
 * @Author:weiwei
 **/
public class mergeSort {

    private static void merge(int[] array,int low,int mid,int high,int[] extra){
        int i = low;
        int j = mid;
        int x = 0;

        while( i < mid && j <high){
            if(array[i] <= array[j]){
                extra[x++] = array[i++];
            }else{
                extra[x++] = array[j++];
            }
        }
        while (i < mid){
            extra[x++] = array[i++];
        }
        while (j < high){
            extra[x++] = array[j++];
        }
        for(int k = low;k<high;k++){
            array[k] = extra[k-low];
        }
    }
    private static void mergeSortInner(int [] array,int low,int high,int[] extra){
        if( low == high-1){
            return;
        }
        if(low >= high){
            return;
        }

        int mid = (high - low)/2;

        mergeSortInner(array,low,mid,extra);
        mergeSortInner(array,mid,high,extra);

        merge(array,low,mid,high,extra);
    }
    private static void mergeSort(int[] array){
        int[] estra = new int[array.length];
        mergeSortInner(array,0,array.length,estra);
    }

    public static void main(String[] args) {
        int [] array = {9,3,6,7,1,2,6,4,8};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
