package com.bittech.Testsynchronized;

/**
 * Author:weiwei
 * Creat:2018/12/26
 **/
//观察synchronized锁多对象
// class Sync{
//     public synchronized void test(){
//         System.out.println("test方法开始,当前线程为"+Thread.currentThread().getName());
//         try{
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("test方法结束,当前线程为:"+Thread.currentThread().getName());
//     }
//}
//class MyThread extends Thread{
//     @Override
//    public void run(){
//         Sync sync = new Sync();
//         sync.test();
//     }
//}
//public class Testsynchronized1 {
//    public static void main(String[] args) {
//        for(int i=0;i<3;i++){
//            Thread thread = new MyThread();
//            thread.start();
//        }
//    }
//}


//锁住同一对象
//class Sync {
//    public void test() {
//        synchronized (this) {
//            System.out.println("test方法开始,当前线程为:" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("test方法结束,当前线程为:" + Thread.currentThread().getName());
//        }
//    }
//}
//class MyThread extends Thread{
//    private Sync sync;
//    public MyThread(Sync sync){
//        this.sync=sync;
//    }
//    @Override
//    public void run(){
//        this.sync.test();
//    }
//}
//public class Testsynchronized1{
//    public static void main(String[] args) {
//        Sync sync = new Sync();
//        for(int i=0;i<3;i++){
//            Thread thread = new MyThread(sync);
//            thread.start();
//        }
//    }
//
//}

//全局锁
//class Sync{
//    public void test(){
//        synchronized(Sync.class){
//            System.out.println("test方法开始,当前线程为:"+Thread.currentThread().getName());
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("test方法结束,当前线程为:"+Thread.currentThread().getName());
//        }
//    }
//}
//class MyThread extends Thread{
//    @Override
//    public void run(){
//        Sync sync = new Sync();
//        sync.test();
//    }
//}
//public class Testsynchronized1{
//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            Thread thread = new MyThread();
//            thread.start();
//        }
//    }
//}