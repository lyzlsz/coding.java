package com;

import java.util.ArrayList;

/**
 * package:com
 * Description:利用快排和二分查找的思想   最小的 k 个数
 * @date:2019/8/14
 * @Author:weiwei
 **/
public class GetLeastNumbers {

    /**利用快排的思想,先将数组以index为基准分为一大一小两个子区间
     * 位于左边的值都比 index 小,右边的数都比 index 大
     *当 index > k-1,说明k个最小的数一定都在index的左边,此时只需要对左边区间进行划分
     *当 index < k-1,说明 index 及 index 左边的数字还没能满足k个数字,需要继续对k右边进行划分
     * @param nums 数组
     * @param k 最小的k个数
     * @return 返回 list
     */
    public ArrayList<Integer> getLeastNumbers(int[] nums, int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lens = nums.length;
        if( lens == 0 || nums == null || k <= 0 || k > lens){
            return list;
        }
        int start = 0;
        int end = lens - 1;
        int index = partiton(nums,start,end);
        while( index != k-1){
            if(index > k-1){   //这一部分类似二分查找,如果 index >k-1
                end = index - 1; //就让end = index-1,淘汰后半部分数组,只处理左边的数组
                index = partiton(nums,start,end); //对左边的小区间再次进行partition
            }else{
                start = index + 1;  //否则去处理右边的区间
                index = partiton(nums,start,end); //对右边的小区间进行partition
            }
        }
        for(int i = 0;i<k;i++){
            list.add(nums[i]);
        }
        return list;
    }

    /**
     *
     * @param nums
     * @param start  partition的开头,也就是数组的第一个元素位置
     * @param end  partition 的结尾,也就是数组的最后一个元素
     * @return  返回 start
     */
    private int partiton(int[] nums, int start, int end) {
        int pivot = nums[start];
        while( start < end){
            while(start < end && pivot <= nums[end]){
                --end;
            }
            swap(nums,start,end);

            while(start > end && pivot >= nums[start]){
                --start;
            }
            swap(nums,start,end);
        }
        return start;
    }

    /**
     *进行交换
     * @param nums
     * @param start
     * @param end
     */
    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {7,3,8,2,9,1,6,4};
        GetLeastNumbers getLeastNumbers = new GetLeastNumbers();
        ArrayList<Integer> list = getLeastNumbers.getLeastNumbers(nums,4);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
