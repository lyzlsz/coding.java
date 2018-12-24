package com.bittech;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Author:weiwei
 * Creat:2018/12/23
 **/

//利用Callable实现多线程
public class Thread4 {

    public static void main(String[] args) {

        Callable<String> callable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        //当前线程名称
        System.out.println(Thread.currentThread().getName());
    }
}

class MyCallable implements Callable<String> {
        private int tick=10;

    @Override
    public String call() throws Exception {
        while(tick>0){
            //Thread.currentThread()获取当前线程
            System.out.println(Thread.currentThread().getName()+ "剩余" +tick--+"张票");
        }
        return "票买完了";
    }
}

