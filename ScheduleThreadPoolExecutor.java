package ThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Author:weiwei
 * Creat:2019/1/15
 * /使用定时调度池
 **/
public class ScheduleThreadPoolExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService executorService =
                Executors.newScheduledThreadPool(5);
        for(int i=0;i<5;i++){
            executorService.scheduleAtFixedRate(new Runnable(){

                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        System.out.println(Thread.currentThread().getName()+", "+j);
                    }
                }
            },2,3,TimeUnit.SECONDS);
        }
    }
}
