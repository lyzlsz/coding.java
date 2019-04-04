package com.bittech;

/**
 * Author:weiwei
 * description:二分查找
 * Creat:2019/3/30
 **/
public class TestBinarySearch {
    public static int binarySearch(int num,int[] array){
        int left = 0; //代表第一个元素，下标从0开始
        int right = array.length -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(array[mid]<num){
                left=mid+1;
            }else if(array[mid]>num){
                left = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={5,1,6,3,7,9};
        int num = 3;
        int position=binarySearch(num,array);
        if(position == -1){
            System.out.println("没找到，序列中没有该数！");
        }else{
            System.out.println("找到了！"+"下标是："+num);
        }
    }
}
