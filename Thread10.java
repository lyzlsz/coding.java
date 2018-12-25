package com.bittech;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
//线程优先级
//class MyThread implements Runnable{
//    @Override
//    public void run() {
//        for(int i=0;i<5;i++){
//            System.out.println("当前线程:"+Thread.currentThread().getName()+" ,i="+i);
//        }
//    }
//}
//public class Thread10 {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread t1 = new Thread(mt,"1");
//        Thread t2 = new Thread(mt,"2");
//        Thread t3 = new Thread(mt,"3");
//        t1.setPriority(Thread.MIN_PRIORITY);  //1
//        t2.setPriority(Thread.MIN_PRIORITY);  //1
//        t3.setPriority(Thread.MAX_PRIORITY);  //10
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
