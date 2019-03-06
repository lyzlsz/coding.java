package Thread;

import java.util.Scanner;


/**
 * Author:weiwei
 * description:回文数组
 * Creat:2019/3/6
 **/
public class Test0306{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int [] nums = new int[len];
            for(int i=0;i<len;i++){
                nums[i] = sc.nextInt();
            }
            Integer[][] dp = new Integer[len][len];
            int res = palindromeArrayHelper(nums,dp,0,len-1);
            System.out.println(res);
        }
        sc.close();
    }
    public static int palindromeArrayHelper(int[] nums,Integer[][] dp,int i,int j){
        if(i>j){
            return 0;
        }
        if(i == j){
            return nums[i];
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(nums[i] == nums[j]){
            dp[i][j] = 2*nums[i] +palindromeArrayHelper(nums,dp,i+1,j-1);
        }
        else{
            dp[i][j] = Math.min(2*nums[i]+palindromeArrayHelper(nums,dp,i+1,j),
                    2*nums[j]+palindromeArrayHelper(nums,dp,i,j-1));
        }
        return dp[i][j];
    }
}
