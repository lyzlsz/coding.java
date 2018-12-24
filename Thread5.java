package com.bittech;

import java.time.LocalDateTime;

/**
 * Author:weiwei
 * Creat:2018/12/23
 **/

//当前线程的取得
public class Thread5 {
//线程休眠
    public static void main(String[] args) {

        //最简洁的写法
        Runnable r = new Runnable(){
            @Override
            public synchronized void run() {
                while(true){
                    try{
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+"执行时间" + LocalDateTime.now());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(r,"Thread-A").start();
        new Thread(r,"Thread-B").start();
        new Thread(r,"Thread-C").start();
    }
}
