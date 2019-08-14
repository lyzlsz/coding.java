package com;

import java.util.ArrayList;

/**
 * package:com
 * Description:冒泡排序思路
 * @date:2019/8/14
 * @Author:weiwei
 **/
public class GetLeastNumbers1 {
    /**
     * 利用冒泡排序思想,进行 k 轮排序,就将 k 个 最小的数字排到最前面
     * 然后返回
     * @param nums
     * @param k
     * @return
     */
    public ArrayList<Integer> getLeastNumbers(int[] nums,int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lens = nums.length;
        if(lens == 0 || nums == null || k <= 0 || k > lens){
            return list;
        }
        int temp;
        for(int i = 0;i<k;i++){
            for(int j = i+1;j<lens;j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            list.add(nums[i]);
        }
        return  list;
    }

    public static void main(String[] args) {
        int [] nums = {7,3,8,2,9,1,6,4};
        GetLeastNumbers1 getLeastNumbers1 = new GetLeastNumbers1();
        ArrayList<Integer> list = getLeastNumbers1.getLeastNumbers(nums,4);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
