package com.bittech;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/22 0022
 * @Author:weiwei
 **/
public class testAdd2 {
    private static List<Integer> list = new ArrayList<>();
    private static List<List<Integer>> res = new ArrayList<>();
    public static void findSum(int sum,int n){
        if(n < 1 || sum  < 1)
            return;
        if(sum <= n){
            list.add(sum);
            res.add(new LinkedList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(n);
        findSum(sum,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            findSum(sum,n);
            System.out.println(res);
            res= new ArrayList<>();
        }
    }
}
