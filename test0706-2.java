package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/5 0005
 * @Author:weiwei
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String n = sc.next();
            if(isQualified(n)){
                System.out.println("ok");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean isQualified(String n){
        int Low = 0,up = 0,num = 0,other= 0;
        if(n.length() <= 8){
            return false;
        }
        for(int i =0;i<n.length();i++){
            char ch = n.charAt(i);
            if('0' <= ch&&ch <='9'){
                num =1;
            }
            if('a' <= ch&&ch <='z'){
                Low=1;
            }
            if('A' <= ch&&ch <= 'Z'){
                up=1;
            }
            else{
                other = 1;
            }
        }
        if(num+Low+up+other <3){
            return false;
        }
        for(int j =0;j<n.length()-4;j++){
            for(int k =j+1;k<n.length()-3;k++){
                if(n.substring(j,j+3).equals(n.substring(k,k+3))){
                    return false;
                }
            }
        }
        return true;
    }
}
