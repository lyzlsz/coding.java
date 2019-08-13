package com;

        import java.util.Scanner;

/**
 * package:com
 * Description:找出最长连续数字串
 * @date:2019/8/13
 * @Author:weiwei
 **/
public class GETLeastString {
    public static void main(String[] args) {
        /**
         * 定义一个maxLength记录最长数字串
         * 定义一个count记录遍历过程中数字个数
         * 如果count > maxLength ,说明maxLength不是最长的字符串,就将count的值复制给maxLength
         * 定义一个end变量来记录数字串的最后一个数字
         * 最后用subString()方法截取字符串
         */
        Scanner sc = new Scanner(System.in);
        String result = null;
        int count =0;
        int maxLength = 0;
        int end = 0;
        while(sc.hasNext()){
            result = sc.nextLine();
            for(int i = 0;i<result.length();i++){
                if(result.charAt(i) >= '0' && result.charAt(i) <= '9'){
                    count++;
                    if(count > maxLength){
                        end = i;
                        maxLength = count;
                    }
                }else{
                    count = 0;
                }
            }
        }
        //字符串下标从0开始,end-maxLength+1就是数字串的开头,end+1是数字串的结尾
        System.out.println(result.substring(end - maxLength+1,end + 1));
    }
}
