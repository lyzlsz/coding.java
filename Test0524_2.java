package com.bittech.Test;

import java.util.Scanner;

/**
 * package:com.bittech.Test
 * Description:输出最长字符串
 * @date:2019/5/24
 * @Author:weiwei
 **/
public class Test0524_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) <= '0' && str.charAt(i) >= '9'){
                    count++;
                    if(max < count){
                        max = count;
                        end  = i;
                    }
                }
                else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max+1,end+1));
        }
    }
}
