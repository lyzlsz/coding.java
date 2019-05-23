package com.bittech.Test;

/**
 * package:com.bittech.Test
 * Description:TODO
 * @date:2019/5/23
 * @Author:weiwei
 **/
public class Test0523_2 {
    public int aMethod(){
        int i =0;
        i++;
        return i;
    }
    public static void main(String[] args) {
        Test0523_2 test = new Test0523_2();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);

    }
}
