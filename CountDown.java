package Test0801;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * package:Test0801
 * Description:TODO
 *
 * @date:2019/8/1 0001
 * @Author:weiwei
 **/
class CDLTask implements Runnable{
    private CountDownLatch countDownLatch;
    public CDLTask(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"开始跑步");
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("到达终点...");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class CountDown {
    public static void main(String[] args)throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        CDLTask cdlTask = new CDLTask(countDownLatch);
        System.out.println("比赛开始");
        new Thread(cdlTask,"运动员A").start();
        new Thread(cdlTask,"运动员B").start();
        new Thread(cdlTask,"运动员C").start();
        new Thread(cdlTask,"运动员D").start();
        //等待所有线程到达终点后再输出这句
        countDownLatch.await();
        System.out.println("比赛结束...");
    }
}
