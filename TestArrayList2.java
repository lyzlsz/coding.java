package com.bittech;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/5
 **/
public class TestArrayList2 {
    public static void main(String[] args) {
        //此时集合里面只保存String类的元素
        List<String> list = new ArrayList<>();
        System.out.println(list.size()+","+list.isEmpty());
        list.add("Hello");
        list.add("Hello");
        list.add("Hi");
        System.out.println(list.size()+","+list.isEmpty());
        System.out.println(list);
        System.out.println(list.remove("Hello"));
        System.out.println(list.contains("ABC"));
        System.out.println(list.contains("Hi"));
        System.out.println(list);
    }
}
