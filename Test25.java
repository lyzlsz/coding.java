//package Thread;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * Author:weiwei
// * description:SingleThreadPoolExecutor
// * Creat:2019/2/25
// **/
//public class Test25 {
//    public static void main(String[] args) {
//        ExecutorService executorService =
//                Executors.newSingleThreadExecutor();
//        for(int i=0;i<5;i++){
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    for(int j=0;j<10;j++){
//                        System.out.println(Thread.currentThread().getName()+","+j);
//                    }
//                }
//            });
//        }
//        executorService.shutdown();
//    }
//}
