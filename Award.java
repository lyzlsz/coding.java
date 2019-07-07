package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/7/7
 * @Author:weiwei
 **/
public class Award {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            float m = denominator(n);//所有可能抽到的情况
            float z = misSort(n);//抽错的情况
            float result = (z / m)*100;//无人中奖的情况
            System.out.println(String.format("%.2f",result)+"%");//打印出概率
        }
    }

    /**
     * 用排列组合求出z,也就是求出多少种抽奖的可能,
     * 如果5个人抽奖,那么第一个人就有5种中奖的可能,第2个人4种,第3个人3种,
     * 以此类推,n个人抽奖可能性就是n!
     */
    public static float denominator(int n) {
        float result = 1;
        if(n == 0){
            return 1;
        }else if(n>0){
            result = n*denominator(n-1);
        }
        return result;
    }
    /**
     * 使用错误排序求出m,就是求出所有抽取错的情况
     * 如果5个人抽奖,第一个人抽错的可能就有4中,第二个人3种
     * 1.第一个人抽到的事第二个人的名字,那么第二个人抽错的概率就是100%,直接求
     * 2.如果第一个人抽到的名字不是第二个人的名字,那么第二个人抽错的可能就有3种
     */
    public static float misSort(int n) {
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else{
            return (n-1)*(misSort(n-1)+misSort(n-2));
        }
    }
}
