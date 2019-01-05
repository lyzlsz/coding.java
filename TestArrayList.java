package com.bittech;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/5
 **/
public class TestArrayList {
    public static void main(String[] args) {
        //此时集合里面只保存String类型
        List<String> list = new ArrayList<>();
        list.add("hello");
        //重复数据
        list.add("hello");
        list.add("Hi");
        System.out.println(list);
    }

}
