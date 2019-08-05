package Thread;

/**
 * package:Thread
 * Description:TODO
 *
 * @date:2019/8/5 0005
 * @Author:weiwei
 **/
//class MyThread implements Runnable{
//    private boolean flag;
//    private Object obejct;
//
//    public MyThread(boolean flag,Object object) {
//        super();
//        this.flag = flag;
//        this.obejct=object;
//    }
//    public void waitMethod(){
//        synchronized (obejct){
//            try {
//                while(true) {
//                    System.out.println("wait()方法开始.." + Thread.currentThread().getName());
//                    obejct.wait();
//                    System.out.println("wait方法()结束.." + Thread.currentThread().getName());return;
//                }
//            } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        public void notifyMethod(){
//        synchronized (obejct) {
//            try {
//                System.out.println("notify()方法开始..." + Thread.currentThread().getName());
//                obejct.notify();
//                System.out.println("notify()方法结束..." + Thread.currentThread().getName());
//            } catch (Exception e) {
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
//}
//public class testnotify {
//    public static void main(String[] args)throws InterruptedException {
//        Object object = new Object();
//        MyThread waitThread = new MyThread(true,object);
//        MyThread notifyThread = new MyThread(false,object);
//        Thread thread1 = new Thread(waitThread,"wait线程");
//        Thread thread2 = new Thread(notifyThread,"notify线程");
//        thread1.start();
//        Thread.sleep(1000);
//        thread2.start();
//        System.out.println("main方法结束!!");
//    }
//}
