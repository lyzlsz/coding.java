package Thread;

/**
 * Author:weiwei
 * description:synchronized锁Class对象
 * Creat:2019/2/20
 **/

class Sync{
    public void test(){
        synchronized(Sync.class){
            System.out.println("test方法开始,当前线程为: "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test方法结束,当前线程为: "+Thread.currentThread().getName());
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        Sync sync = new Sync();
        sync.test();
    }
}
public class Test022 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            Thread thread = new MyThread();
            thread.start();
        }
    }
}
