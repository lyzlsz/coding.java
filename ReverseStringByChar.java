package com.bittech;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/8 0008
 * @Author:weiwei
 **/
public class ReverseString {

    /**
     * 利用系统自带的StringBuilder.reverse()进行反转
     * @param str
     * @return
     */
    public static String reverseByStringBuilder(String str){
        if(str == null){
            return " ";
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 字符串二分反转
     * @param str
     * @return
     */
    public static String reverseByCharArray(String str){
        if(str == null){
            return " ";
        }
        char[] chArr = str.toCharArray();
        int len = chArr.length;
        for(int i =(len-1)/2;i>=0;i--){
            char c = chArr[i];
            chArr[i] = chArr[len-i-1];
            chArr[len-i-1] = c;
        }
        return new String(chArr);
    }

    /**
     * 异或反转
     * @param str
     * @return
     */
    public static String reverseByXor(String str){
        if(str == null){
            return " ";
        }
        char[] chArr = str.toCharArray();
        int len = chArr.length;
        for(int i =0,j=len-1;i<len/2;i++,j--){
            chArr[i] = (char)(chArr[i]^chArr[j]);
            chArr[j] = (char)(chArr[j]^chArr[i]);
            chArr[i] = (char)(chArr[j]^chArr[i]);
        }
        return new String(chArr);
    }
    public static String reverseByStack(String str){
        if(str == null){
            return " ";
        }
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        for(int i =0;i<len;i++){
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<len;i++){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(reverseByStringBuilder(str));
        //System.out.println(reverseByCharArray(str));
        //System.out.println(reverseByXor(str));
        System.out.println(reverseByStack(str));
//        str.trim();//去掉字符串前后的空格
//        String a[] = str.split(" ");
//        for(int i =a.length-1;i>0;i--){
//            System.out.print(a[i] + " ");
//        }
//        System.out.print(a[0]);
    }
}
