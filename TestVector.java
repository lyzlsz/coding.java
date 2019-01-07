package com.bittech;

import java.util.List;
import java.util.Vector;

/**
 * Author:weiwei
 * Creat:2019/1/5
 **/
public class TestVector {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("java");
        list.add("PHP");
        list.add("C++");
        System.out.println(list);
        list.remove("PHP");
        System.out.println(list);
    }
}
