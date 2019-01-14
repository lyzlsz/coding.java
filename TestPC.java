package Test;

/**
 * Author:weiwei
 * Creat:2019/1/12
 **/

//商品类
class Goods{
    //商品名称
    private String goodsName;
    //商品库存
    private int count;
    //生产方法
    public synchronized void set(String goodsName)throws InterruptedException {
        //此时商品还没被消费,等待消费者消费
        if(this.count >0){
            System.out.println("还有库存哦!等待消费者...");
            wait();
        }
        this.goodsName=goodsName;
        this.count =count+1;
        Thread.sleep(1000);
        System.out.println("生产"+toString());
        //生产完商品后,通知消费者可以消费了
        notify();
    }
    //消费方法
    public synchronized void get() throws InterruptedException {
        //此时还没有商品,等待生产者生产商品
        if(count == 0){
            System.out.println("商品买完了,客官等待哦!");
            wait();
        }
        //每次消费一个商品
        this.count=this.count -1;
        Thread.sleep(1000);
        System.out.println("消费"+toString());
        //消费完了告知生产者可以继续生产了
        notify();
    }
    @Override
    public String toString(){
        return "Goods [goodsName=" +goodsName +",count"+"]";
    }
}

//生产类
class Productor implements Runnable{
    private Goods goods;
    public Productor (Goods goods){
        super();
        this.goods=goods;
    }

    @Override
    public void run() {
        try{
            this.goods.set("奔驰C200L一辆");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//消费类
class Consumer implements Runnable{
    private Goods goods ;

    public Consumer(Goods goods){
        super();
        this.goods =goods;
    }

    @Override
    public void run() {
        try{
            this.goods.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//测试类
public class TestPC {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Thread ProduceThread = new Thread(new Productor(goods),"生产者线程");
        Thread ConsumerThread= new Thread(new Consumer(goods),"消费者线程");
        //启动生产者线程
        ProduceThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //启动消费者线程
        ConsumerThread.start();
    }
}
