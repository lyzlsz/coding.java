package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/25
 **/
//线程停止
//用Thread类的interrupt方法

//class MyThread implements Runnable{
//    private boolean flag= true;
//    @Override
//    public void run() {
//        int i=1;
//        while(flag){
//            try{
//                //这里被阻塞之后线程调用了interrupt方法
//                //清除中断标志就会抛出一个异常
//                Thread.sleep(1000);
//                boolean bool = Thread.currentThread().isInterrupted();
//                if(bool){
//                    System.out.println("非阻塞情况下执行该操作...线程状态"+bool);
//                    break;
//                }
//                System.out.println("第"+i+ "次执行,线程名称为:"+Thread.currentThread().getName());
//                i++;
//            } catch (InterruptedException e) {
//                System.out.println("退出了");
//                //这里退出阻塞状态,且中断表示会被系统自动清除
//                //并且重新设定为false,所以此处bool为false
//                boolean bool = Thread.currentThread().isInterrupted();
//                System.out.println(bool);
//                //退出run方法,中断进程
//                return;
//            }
//        }
//    }
//    public void setFlag(boolean flag){
//        this.flag=flag;
//    }
//}
//public class Thread9 {
//    public static void main(String[] args)throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1= new Thread(myThread,"子线程A");
//        thread1.start();
//        Thread.sleep(3000);
//        thread1.interrupt();
//        System.out.println("代码结束");
//    }
//
//}
