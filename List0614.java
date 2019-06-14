package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/14
 * @Author:weiwei
 **/
public class List0614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int c = 0;  //相同珠子的数量
        int cha =0; //所缺珠子的数量
        StringBuffer b1 = new StringBuffer(str1);
        StringBuffer b2 = new StringBuffer(str2);
        for(int i =0;i<b2.length();i++){
            int b =0;
            for(int j =0;j<b1.length();j++) {
                if (b2.charAt(i) == b1.charAt(j)) {
                    c++;
                    b++;
                    b2.deleteCharAt(j);
                    break;
                }
            }
            if(b == 0){
                cha++;
            }
        }
        if(c == b2.length()){
            System.out.print("yes"+" "+(b1.length()-(b2.length())));
        }else{
            System.out.print("No"+" "+(cha));
        }
    }
}
