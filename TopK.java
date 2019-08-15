package com;

import java.util.ArrayList;

/**
 * package:com
 * Description:快排实现
 * @date:2019/8/14 0014
 * @Author:weiwei
 **/
public class TopK {
    public static void partitionSort(int[] nums,int low,int high,int k){
        if(low < high){
            int pivot = partitionSortCore(nums,low,high);
            if(k - 1 == pivot){
                return;//说明已经排序好了K个最大/最小的数，但是之间的顺序是不确定的
            }
            partitionSort(nums,low,pivot-1,k);
            partitionSort(nums,pivot+1,high,k);
        }
    }

    /**
     * 快排的核心
     * @param nums
     * @param low
     * @param high
     * @return 返回排序好后的位置
     */
    private static int partitionSortCore(int[] nums, int low, int high) {
        int pivot = nums[low];
        while(low < high){
            while(low < high && pivot <= nums[high]){
                --high;
            }
            swap(nums,low,high);
            while (low < high && pivot >= nums[low]){
                ++low;
            }
            swap(nums,low,high);
        }
        return low;
    }

    private static void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}
