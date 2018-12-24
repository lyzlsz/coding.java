package com.bittech;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
//线程让步
public class Thread6 {

    public static void main(String[] args) {
        Runnable runnable = () ->{
            for(int i=1;i<3;i++){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+ "i=" +i);
            }
        };
        new Thread(runnable,"Thread-A").start();
        new Thread(runnable,"Thread-B").start();
        new Thread(runnable,"Thread-C").start();
    }
}
