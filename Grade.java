package com.bittech;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/15
 * @Author:weiwei
 **/
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int[] data = new int[2];
            data[0] = sc.nextInt();
            data[1] = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < data[0]; i++) {
                array.add(sc.nextInt());
                int time = 0;
                char a;
                int b, c;
                while (time < data[i]) {
                    a = sc.next().charAt(0);
                    b = sc.nextInt();
                    c = sc.nextInt();
                    if (a == 'Q') {
                        int start, end;
                        if (b < c) {
                            start = b - 1;
                            end = c - 1;
                        } else {
                            start = c - 1;
                            end = b - 1;
                        }
                        int max = array.get(start);
                        for (int index = start + 1; index <= end; index++) {
                            if (max < array.get(index)) {
                                max = array.get(index);
                            }
                        }
                        System.out.println(max);
                        max = 0;
                    }
                    if (a == 'U') {
                        int index1 = b - 1;
                        int newValue = c;
                        array.set(index1, newValue);
                    }
                    time++;
                }
            }
        }
        while (sc.hasNext()) ;
        sc.close();
    }
}

