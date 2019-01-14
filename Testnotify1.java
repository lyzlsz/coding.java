package Test;

/**
 * Author:weiwei
 * Creat:2019/1/14
 **/

//生产者消费者模型
    //notify()方法唤醒线程

//class MyThread implements Runnable{
//    private boolean flag;
//    private Object obj;
//
//    public MyThread(boolean glag,Object obj){
//        super();
//        this.flag=flag;
//        this.obj=obj;
//    }
//
//    private void notifyMethod(){
//        synchronized(obj){
//            try{
//                System.out.println("notify()方法开始"+Thread.currentThread().getName());
//                obj.notify();
//                System.out.println("notify()方法结束"+Thread.currentThread().getName());
//            }catch (Exception  e){
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Override
//    public void run() {
//        if(flag){
//            this.waitMethod();
//        }else{
//            this.notifyMethod();
//        }
//    }
//
//    private void waitMethod() {
//        synchronized(obj){
//            try{
//                while(true){
//                    System.out.println("wait()方法开始"+Thread.currentThread().getName());
//                    obj.wait();
//                    System.out.println("wait()方法结束"+Thread.currentThread().getName());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    }
//public class Testnotify1 {
//    public static void main(String[] args) {
//        Object object = new Object();
//        MyThread waitThread = new MyThread(true,object);
//        MyThread notifyThread = new MyThread(true,object);
//        Thread thread1= new Thread(waitThread,"wait线程");
//        Thread thread2= new Thread(notifyThread,"notify线程");
//        thread1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread2.start();
//        System.out.println("main方法结束");
//    }
//}
