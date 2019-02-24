package Thread;

import java.util.concurrent.*;

/**
 * Author:weiwei
 * description:submit()方法
 * Creat:2019/2/24
 **/

class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "," + i);
        }
            return Thread.currentThread().getName() + "任务执行完毕";
        }
    }
    public class Test224 {
        public static void main(String[] args) {
            CallableThread callableThread = new CallableThread();
            ThreadPoolExecutor threadPoolExecutor = new
                    ThreadPoolExecutor(3,5,2000,
                    TimeUnit.MILLISECONDS,new LinkedBlockingDeque<Runnable>());
                    for(int i=0;i<5;i++){
                        Future<String> future = threadPoolExecutor.submit(callableThread);
                        try{
                            String str = future.get();
                            System.out.println(str);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                    }
        }
    }

