package Thread;

/**
 * package:Thread
 * Description:TODO
 * @date:2019/8/5
 * @Author:weiwei
 **/
public class testWait {
    public static void main(String[] args) {
        Object ob = new Object();
        synchronized (ob){
            System.out.println("等待中...");
            try {
                ob.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("等待已过时...");
        }
        System.out.println("main方法结束..");
    }
}
