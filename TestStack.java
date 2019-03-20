package com.bittech;

/**
 * Author:weiwei
 * description:递归--栈溢出
 * Creat:2019/3/19
 **/
public class TestStack {
    private int depth = 0;
    public void test(){
        this.depth ++;
        this.test();
    }

    public static void main(String[] args) {
        TestStack teststack = new TestStack();
        try{
            teststack.test();
        }catch(Throwable e){
            e.printStackTrace();
            System.out.println(teststack.depth);
        }
    }
}
