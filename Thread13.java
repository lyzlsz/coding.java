package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/25
 **/

//线程同步与死锁
 //多个线程同时买票
//class MyThread implements Runnable{
//    private int ticket=10;
//    @Override
//    public void run() {
//        while(this.ticket>0){
//            try{
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }//模拟网络延迟
//            System.out.println(Thread.currentThread().getName()+"还有"+this.ticket--+ "张票");
//        }
//    }
//}
//public class Thread13 {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        new Thread(mt,"黄牛A").start();
//        new Thread(mt,"黄牛B").start();
//        new Thread(mt,"黄牛C").start();
//    }
//}
//票数出现负数,这是因为不同步操作,处理速度快,因为多个线程并发执行,