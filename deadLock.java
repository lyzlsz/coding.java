package com;

/**
 * package:com
 * Description:TODO
 *
 * @date:2019/7/31 0031
 * @Author:weiwei
 **/
public class deadLock {
    private static Pen pen = new Pen();
    private static Book book = new Book();

    public static void main(String[] args) {
        new deadLock().deadLock();
    }

    public void deadLock() {
        Thread thread1 = new Thread(new Runnable() { // 笔线程
            @Override
            public void run() {
                synchronized (pen) {
                    System.out.println(Thread.currentThread() + " :我有笔，我就不给你");
                    synchronized (book) {
                        System.out.println(Thread.currentThread() + " :把你的本给我！");
                    }
                }
            }
        }, "Pen");
        Thread thread2 = new Thread(new Runnable() { // 本子线程
            @Override
            public void run() {
                synchronized (book) {
                    System.out.println(Thread.currentThread() + " :我有本子，我就不给你！");
                    synchronized (pen) {
                        System.out.println(Thread.currentThread() + " :把你的笔给我！");
                    }
                }
            }
        }, "Book");
        thread1.start();
        thread2.start();
    }
}

