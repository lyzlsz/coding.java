package com.bittech;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/2
 * @Author:weiwei
 **/
public class GrayCode {
    public String[] getGray(int n){
        String[] resStrs = null;
        if (n == 1) {
            resStrs = new String[]{"0","1"};
        }else{
            String[] strs = getGray(n-1);
            resStrs = new String[2*strs.length];
            for(int i = 0;i<strs.length;i++){
                resStrs[i] = "0"+strs[i];
                resStrs[resStrs.length-i-1]="1"+strs[i];
            }
        }
        return resStrs;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
