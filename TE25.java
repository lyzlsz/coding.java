package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Author:weiwei
 * description:定时调度池
 * Creat:2019/2/25
 **/
public class TE25 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService =
                Executors.newScheduledThreadPool(5);
        for(int i=0;i<5;i++){
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        System.out.println(Thread.currentThread().getName()+","+j);
                    }
                }
            },2,3, TimeUnit.SECONDS);
        }
    }
}
