package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/23
 **/


public class Thread3 extends Thread {
    //使用Thread实现数据共享(产生若干线程处理同一数据)
    private static int tick=10;

    @Override
    public void run(){
        while(tick>0){
            System.out.println(this.getName()+"剩余:" + tick +"张票");
        }
    }

    public static void main(String[] args) {

//        Thread3 thread1= new Thread3();
//        thread1.setName("Thread-A");
//        Thread3 thread2= new Thread3();
//        thread2.setName("Thread-B");
//
//        thread1.start();
//        thread2.start();

//使用Runnable实现共享
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while(tick>0){
                    //Thread.currentThread获取当前线程
                    System.out.println(Thread.currentThread().getName()+"剩余" + tick--+"张票");
                }
            }
        };

        new Thread(runnable,"Thread-A");
        new Thread(runnable,"Thread-B");
    }
}
