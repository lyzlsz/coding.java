package com.bittch;

import java.util.Hashtable;
import java.util.Map;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class TestHashtable {
    public static void main(String[] args) {
        Map<Integer,String> map=new Hashtable<>();
        map.put(1,"java");
        map.put(2,"C++");
        map.put(3,"PHP"); //后一个3相当于是重新修改了value,所以输出后者
        map.put(3,"C");//key value 都不能为空
        //map.put(5,null);
        //map.put(null,"hello")
        System.out.println(map);

    }
}
