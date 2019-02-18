package Thread;

/**
 * Author:weiwei
 * description:同步方法
 * Creat:2019/2/18
 **/


class MyThread implements Runnable{
    private int ticket = 1000;
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            this.sale();
        }
    }
    public synchronized void sale(){
        if(this.ticket>0){   //还有票
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    +",还有"+this.ticket --+"张票");
        }
    }
}
public class Test021 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "黄牛A");
        Thread t2 = new Thread(mt, "黄牛B");
        Thread t3 = new Thread(mt, "黄牛C");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
