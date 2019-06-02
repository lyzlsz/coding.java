package com.bittech;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/2
 * @Author:weiwei
 **/
public class Exchange {
    public int[] exchangeAB(int []AB){
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
//        AB[0] = AB[0] + AB[1];
//        AB[1] = AB[0] - AB[1];
//        AB[0] = AB[0] - AB[1];
            return AB;
        }

    public static void main(String[] args) {
        int[] AB={1,2};
        System.out.println("交换后的顺序:");

    }
}
