package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/25
 **/
//synchronized处理同步问题
    //使用同步代码块
//class MyThread implements Runnable{
//    private int ticket=1000;
//    @Override
//    public void run() {
//        for(int i=1;i<1000;i++){
//            //同一时刻只允许一个线程进入代码块处理
//            synchronized(this){
//                if(this.ticket>0){
//                    try{
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }//模拟网络延迟
//                    System.out.println(Thread.currentThread().getName()+
//                            ",还有"+this.ticket--+"张票");
//                }
//            }
//        }
//    }
//}
//public class Thread14 {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread t1= new Thread(mt,"黄牛A");
//        Thread t2 = new Thread(mt,"黄牛B");
//        Thread t3 = new Thread(mt,"黄牛C");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
