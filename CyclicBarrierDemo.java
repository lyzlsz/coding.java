package Test0801;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * package:Test0801
 * Description:TODO
 *
 * @date:2019/8/1 0001
 * @Author:weiwei
 **/
class CBTask implements Runnable{
    private CyclicBarrier cyclicBarrier;

    public CBTask(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在写入数据....");
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName()+"写入数据完毕,等待其他线程写入完毕...");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch(BrokenBarrierException e){
            e.printStackTrace();
        }
        System.out.println("所有线程均已写入完毕,继续恢复执行...");

    }
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        CBTask cbtTask = new CBTask(cyclicBarrier);
        for (int i = 0; i < 4; i++) {
            new Thread(cbtTask,"写线程"+(i+1)).start();

        }
    }

}
