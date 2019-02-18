package Thread;

/**
 * Author:weiwei
 * description:多个线程同时买票
 * Creat:2019/2/18
 **/


//class MyThread implements Runnable{
//    private int ticket = 10; //一共十张票
//
//    @Override
//    public void run() {
//        while(this.ticket>0){ //还有票
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+",还有"+this.ticket--+"张票");
//        }
//    }
//}
//public class Test0218 {
//    public static void main(String[] args) {
//        MyThread mt=new MyThread();
//        new Thread(mt,"黄牛A").start();
//        new Thread(mt,"黄牛B").start();
//        new Thread(mt,"黄牛C").start();
//    }
//}
