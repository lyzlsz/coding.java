package com.bittech;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/5
 **/
public class TestArrayList3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Hello");
        list.add("Hi");
        list.add("Hi");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
