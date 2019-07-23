package com.bittech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/7/23
 * @Author:weiwei
 **/
public class defineName {
    public static String LineToHump(String str){
        String LineToHump = "";
        String[] arr = str.split("_");
        List<String> list = new ArrayList<String>();
        //将数组中非空字符串添加至list
        for(String a:arr){
            if(a.length() > 0){
                list.add(a);
            }
        }
        for(int i =0;i<list.size();i++){
            if(i>0){ //后面单词首字母大写
                char c = list.get(i).charAt(0);
                String s = String.valueOf(c).toLowerCase()+list.get(i).substring(1).toLowerCase();
                LineToHump+=s;
            }else{    //首个单词小写
                LineToHump +=list.get(i).toLowerCase();
            }
        }
        return LineToHump;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(LineToHump(str));
    }
}
