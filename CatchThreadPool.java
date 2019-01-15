package ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author:weiwei
 * Creat:2019/1/15
 * /使用缓冲线程池
 **/
public class CatchThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.submit(new Runnable(){
                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        System.out.println(Thread.currentThread().getName()+" , "+j);
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
