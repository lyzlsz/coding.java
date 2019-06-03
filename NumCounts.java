package com.bittech;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

/**
 * package:com.bittech
 * Description:NumCounts
 * @date:2019/6/3
 * @Author:weiwei
 **/
public class NumCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字: ");
        String N = sc.next();
        char [] chars = N.toCharArray();
        /**
         * 创建list,10个item(0-9),每个item得值表示数字的个数,
         */
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            list.add(0);//初始化为0
        }
        for(int i = 0;i<chars.length;i++){
            //每次遇到一个数字,数字就加1
            list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
        }
        for(int i =0;i<list.size();i++){
            if(list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }
    }
}
