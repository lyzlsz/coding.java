package com.bittech;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
//线程优先级继承
//class A implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("A的优先级为"+Thread.currentThread().getPriority());
//        Thread thread = new Thread(new B());
//        thread.start();
//    }
//}
//class B implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("B的优先级为:"+Thread.currentThread().getPriority());
//    }
//}
//public class Thread11 {
//    public static void main(String[] args)throws InterruptedException {
//        Thread thread = new Thread(new A());
//        thread.setPriority(Thread.MAX_PRIORITY);
//        thread.start();
//    }
//}
//A和B是一样的优先级 ---10
