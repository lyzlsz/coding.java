package Test;

/**
 * Author:weiwei
 * Creat:2019/1/12
 * **/

//生产者消费者模型
    //wait()方法
public class TestWait {
    public static void main(String[] args) {

        Object object = new Object();

        new Thread(() ->{
            synchronized (object){
                object.notify();
            }
        }).start();
        synchronized(object){
            System.out.println("同步开始");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("同步结束");
        }
    }
}
