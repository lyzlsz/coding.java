package com.bittech;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/4 0004
 * @Author:weiwei
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            String m = String.valueOf(N);
            int sum = N * N;
            String sum1 = Integer.toString(sum);
            String total = sum1.substring(sum1.length() - m.length());
            int n1 = Integer.parseInt(total);
            if (n1 == N) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
