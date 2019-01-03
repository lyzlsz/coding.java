package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/3
 **/
//观察死锁
class Pen{
    private String Pen = "笔";
    public String getPen(){
        return Pen;
    }
}
class Book{
    private String book = "本";
    public String getBook(){
        return book;
    }
}
public class TestDeadLock {
    private static Pen pen = new Pen();
    private static Book book = new Book();

    public static void main(String[] args) {
        new TestDeadLock().deadLock();
    }
    private void deadLock() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(pen){
                    System.out.println(Thread.currentThread().getName() +":我有笔,我就不给你");
                    synchronized(book){
                        System.out.println(Thread.currentThread().getName()+":把你的本给我");
                    }
                }
            }
        },"pen");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(pen){
                    System.out.println(Thread.currentThread().getName()+" :我有本子,我就不给你");
                    synchronized(book){
                        System.out.println(Thread.currentThread().getName()+":把你的笔给我!");
                    }
                }
            }
        },"book");
        thread1.start();
        thread2.start();
    }
}
