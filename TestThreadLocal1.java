package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/4
 **/
//ThreadLocal的简单使用
public class TestThreadLocal1 {
    private static String commStr;
    private static ThreadLocal<String> threadStr = new ThreadLocal<String>();
    public static void main(String[] args) {
        commStr ="main";
        threadStr.set("main");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                commStr = "thread";
                threadStr.set("thread");
            }
        });
        thread.start();
        try{
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(commStr);
        System.out.println(threadStr.get());
    }
}
//ThreadLocal类型的变量的值在每个线程中是独立的

