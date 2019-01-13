package Test;

/**
 * Author:weiwei
 * Creat:2019/1/12
 **/

//生产者消费者模型
//notify()方法
public class TestNotify {
    public static void main(String[] args) {
        Object object = new Object();
        new Thread(new MyRunnable(true,object),"生产者A").start();
        new Thread(new MyRunnable(true,object),"生产者B").start();
        new Thread(new MyRunnable(true,object),"生产者C").start();

        new Thread(new MyRunnable(true,object),"消费者A").start();
        new Thread(new MyRunnable(true,object),"消费者B").start();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyRunnable implements Runnable{

    //true 表示生产者
    //false 表示消费者
    private boolean flag;
    private final Object object;

    MyRunnable(boolean flag,Object object){
        this.flag =flag;
        this.object =object;
    }
    @Override
    public void run() {
        if(flag){  //表示是生产者还是消费者
            this.waitMethod();
        }else{
            this.notifyMethod();
        }
    }
    private void notifyMethod(){
        synchronized(object){
            String name=Thread.currentThread().getName();
            System.out.println("消费者开始");
            this.object.notifyAll();
            System.out.println("消费者结束");
        }
    }
    private void waitMethod(){
        synchronized(object){
            while(true){
                String name=Thread.currentThread().getName();
                System.out.println("生产者开始");
                try{
                    this.object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者结束");
            }
        }
    }
}