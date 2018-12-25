package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/25
 **/
//线程停止
//设置标记让线程正常退出
//class MyThread implements  Runnable{
//    private boolean flag = true;
//    @Override
//    public void run() {
//        int i=1;
//        while(flag){
//            try{
//                Thread.sleep(1000);
//                System.out.println("第"+ i+ "次执行,线程名称为:"
//                        +Thread.currentThread().getName());
//                i++;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void setFlag(boolean flag){
//        this.flag=flag;
//    }
//}
//public class Thread8{
//
//    public static void main(String[] args)throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread("子线程A");
//        thread1.start();
//        Thread.sleep(2000);
//        myThread.setFlag(false);
//        System.out.println("代码结束");
//    }
//}
