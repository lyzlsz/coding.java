package ThreadPoolExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author:weiwei
 * Creat:2019/1/15
 * /使用单线程池
 **/
public class SingleThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            executorService.submit(new Runnable(){

                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        System.out.println(Thread.currentThread().getName()+","+j);
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
