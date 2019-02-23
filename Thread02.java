package Thread;

/**
 * Author:weiwei
 * description:wait()方法
 * Creat:2019/2/23
 **/
public class Thread02 {
    public static void main(String[] args)throws InterruptedException  {
        Object object = new Object();
        synchronized(object ){
            System.out.println("等待中...");
            object.wait();
            System.out.println("等待已过..");
        }
        System.out.println("main方法结束");
    }
}
