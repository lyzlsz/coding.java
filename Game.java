package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/15
 * @Author:weiwei
 **/
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] b = new int[n];
            int a = sc.nextInt();
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                System.out.println(energy(n, a, b));
            }
        }
    }

    public static int energy(int n, int a, int[] b) {
        for (int i = 0; i < n; i++) {
            if (a >= b[i]) {
                a = a + b[i];
            } else {
                a = a + maxCommonNum(b[i], a);
            }
            return a;
        }
        return a;
    }

    static int maxCommonNum(int m,int n){
        if(m < n){
            int temp = m;
            m = n;
            n = temp;
        }
        if( m % n == 0){
            return n;
        }else{
            return maxCommonNum(n,m%n);
        }
    }
}

