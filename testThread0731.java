package com;

/**
 * package:com
 * Description:TODO
 *
 * @date:2019/7/31
 * @Author:weiwei
 **/
//class MyThread implements Runnable {
//    private  int tickets = 10;
//    @Override
//    public void run() {
//        while(tickets > 0){
//            System.out.println("剩余票数:"+this.tickets--);
//        }
//    }
//}
//public class testThread{
//    public static void main(String[] args) {
//        MyThread th = new MyThread();
//        new Thread(th).start();
//        new Thread(th).start();
//    }
//}

class Pen {
    private String pen = "笔";

    public String getPen() {
        return pen;
    }
}

class Book {
    private String book = "本";

    public String getBook() {
        return book;
    }
}
