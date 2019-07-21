package com.bittech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/7/21
 * @Author:weiwei
 **/
public class maxArray {
    public static void main(String []args){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            Scanner sc2 = new Scanner(System.in);
            arr[i] = sc2.nextInt();
        }
        int count =0;
        int m =0;
        int[] sum =new int[n-2];
        for(int i =0;i<arr.length-2;i++){
            //判断是否连续
            if(((arr[i]-arr[i+1] == -1 && arr[i+1] - arr[i-1] == -1))
                ||(arr[i] -arr[i+1] == 1) && arr[i+1]-arr[i+2] == 1){
                count++;
            }else if(count !=0){
                //等差数列求和
                if(count % 2 == 0){
                    sum[m] = ((count+2)/2)*(arr[i-count]+arr[i+1]);
                }else{
                    sum[m] = (count+2)*(arr[i-1]);
                }
                count=0;
                m++;
            }
            else{
                count=0;
            }
            if((i == arr.length-3)&&(count != 0)){
                if(count % 2 == 0){
                    sum[m] = ((count+2)/2)*(arr[i-count]+arr[i+1]);
                }else{
                    sum[m]=(count+2)*(arr[i-1]);
                }
            }
        }
        System.out.println(Arrays.toString(sum));
        Arrays.sort(sum);
    }
}
