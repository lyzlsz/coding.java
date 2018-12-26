package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/25
 **/
//守护线程
class A implements Runnable{
    private int i;
    @Override
    public void run() {
        try{
            while(true){
                i++;
                System.out.println("线程名称:"+Thread.currentThread().
                        getName()+" ,i="+i+",是否为守护线程"+Thread.currentThread().isDaemon());
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("线程名称:"+Thread.currentThread().getName()+"中断线程了");
        }
    }
}
public class Thread12 {
    public static void main(String[] args)throws InterruptedException{
        Thread thread1 =new Thread(new A(),"子线程A");
        //设置A为守护线程,此语句必须在start方法之前执行
        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new A(),"子线程B");
        thread2.start();
        Thread.sleep(3000);
        //中断非守护线程   B是用户线程
        thread2.interrupted();
        Thread.sleep(10000);
        System.out.println("代码结束");
    }
}
//所有用户线程结束了守护线程才会结束
