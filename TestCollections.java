package com.bittch;

import java.util.*;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class TestCollections {


    public static void main(String[] args){
        //线程不安全
        //Map<String,String> map=new HashMap<>();
       // map.put("1","java");
        //System.out.println(map); //HashMap线程不安全

        //线程安全
       // Map<Integer,String> map1= Collections.synchronizedMap(new HashMap<>());
       // System.out.println(map.getClass().getName());

        List<String> data=new ArrayList<>();
        for(int i=65;i<123;++i){
            data.add(String.valueOf((char)i));
        }
        System.out.println("原始数据:"+data);

        //反转方法
        Collections.reverse(data);
        System.out.println("反转后的数据:"+data);

        //查找
        System.out.println(data.get(0));
        System.out.println(data.size());

        int index=Collections.binarySearch(data,"z");
        System.out.println("查看z的下标:"+index);
        System.out.println("查看A的下标"+Collections.binarySearch(data,"A"));


        //乱序
        Collections.shuffle(data);
        System.out.println(data);

        //1.非同步集合-->同步集合
        //2.集合-->不可修改
        Map<String,String> map=new HashMap<>();
        System.out.println(map.put("1","java"));
        map=Collections.unmodifiableMap(map);










    }
}
