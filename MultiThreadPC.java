package Test0801;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * package:Test0801
 * Description:TODO
 *
 * @date:2019/8/1 0001
 * @Author:weiwei
 **/

class Goods{
    private int maxGoodsNum;
    private int currentNum;
    private Lock lock = new ReentrantLock();
    //生产者等待队列
    private Condition ProductorQueue = lock.newCondition();
    //消费者等待队列
    private Condition constomerQueue = lock.newCondition();

    public Goods(int maxGoodsNum){
        this.maxGoodsNum = maxGoodsNum;
    }

    public void Productor(){
        lock.lock();
        while(this.currentNum == maxGoodsNum){
            try {
                ProductorQueue.await();
                System.out.println(".....");
                currentNum++;
                //唤醒消费者线程
                constomerQueue.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        }

    }
}
public class MultiThreadPC {
}
