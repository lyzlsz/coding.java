package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/11 0011
 * @Author:weiwei
 **/
public class Goupstairs {
    public static int countWays(int n) {
        int a[] ={1,1,2};
        if(n < 3){
            return a[n];
        }
        int i =3;
        for(;i <= n;i++){
            int x =0;
            for(int j =0;j<3;j++){
                x+= a[(i+j) % 3];
                x %= 1000000007;
            }
            a[i % 3] = x;
        }
        return a[(i-1)% 3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
