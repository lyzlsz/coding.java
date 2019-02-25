package Thread;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * Author:weiwei
// * description:缓冲线程池
// * Creat:2019/2/25
// **/
//public class Test025 {
//    public static void main(String[] args) {
//        ExecutorService executorService =
//                Executors.newCachedThreadPool();
//        for(int i=0;i<5;i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 10; j++) {
//                        System.out.println(Thread.currentThread().getName() + "," + j);
//                    }
//                }
//            });
//        }
//            executorService.shutdown();
//    }
//}
