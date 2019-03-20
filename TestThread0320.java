package com.bittech;

/**
 * Author:weiwei
 * description:多线程下内存溢出异常
 * Creat:2019/3/19
 **/
public class TestThread0320 {
    private void dontStop() {
        while(true) {
        }
    }
    public void stackLeakByThread() {
        while(true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }
    public static void main(String[] args) {
        TestThread0320 testThread = new TestThread0320();
        testThread.stackLeakByThread();
    }
}
