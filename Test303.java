package Thread;

/**
 * Author:weiwei
 * description:volatile变量自增操作
 * Creat:2019/3/3
 **/
public class Test303 {
    public static volatile int num = 0;
    public static void increase() {
        num++;
    }
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(num);
    }
}
