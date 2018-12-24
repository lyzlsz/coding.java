package com.bittech;

/**
 * Author:weiwei
 * Creat:${Date}
 **/

//join()方法
public class Thread7 {

    public static void main(String[] args) {

        //业务逻辑
        MyRunnable runnable = new MyRunnable();

        //线程
        Thread thread = new Thread((Runnable) runnable, "Thread-A");
        thread.start();

        //在主线程调用join方法会阻塞主线程
        //直到调用线程对象的run方法执行完毕之后,主线程才会继续执行
//        try{
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("当前线程:" + Thread.currentThread().getName());//main


    }
}
class MyRunnable implements Runnable{
    private int tick=10;

    @Override
    public void run() {
        while(tick>0){
            System.out.println(Thread.currentThread().getName()+"tick="+tick--);
        }
    }
}
