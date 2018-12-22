package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/22
 **/


class MyThread implements Runnable{
    private boolean flag =true;

    @Override
    public void run() {
        int i=1;
        while(flag){
            try{
                Thread.sleep(1000);
                System.out.println("第"+i+"次执行,线程名称");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class TestThread {



}
