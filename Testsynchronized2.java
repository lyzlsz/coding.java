package com.bittech.Testsynchronized;

        import java.util.concurrent.locks.Lock;
        import java.util.concurrent.locks.ReentrantLock;

/**
 * Author:weiwei
 * Creat:2018/12/26
 **/

//对象锁机制
//public class Testsynchronized2 {
//    private static Object object = new Object();
//
//    public static void main(String[] args) {
//        synchronized (object) {
//            System.out.println("Hello world");
//        }
//    }
//}


//使用ReentrantLock进行同步处理
class MyThread implements Runnable{
    private int ticket=50;
    private Lock ticketLock = new ReentrantLock();
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            ticketLock.lock();
            try{
                if(this.ticket>0){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"还有"+this.ticket--+"张票");
                }
            }finally {
                ticketLock.unlock();
            }
        }
    }
}
public class Testsynchronized2{
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt,"黄牛A");
        Thread t2 = new Thread(mt,"黄牛B");
        Thread t3 = new Thread(mt, "黄牛C");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}