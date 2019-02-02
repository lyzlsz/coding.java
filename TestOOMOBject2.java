package com.bittech;

/**
 * Author:weiwei
 * description:观察多线程下的内存溢出异常
 * Creat:2019/2/1
 **/

/**
 * JVM参数为:-Xss2M
 * @author :38134
 */
public class TestOOMOBject2 {
    private void dontStop(){
        while(true){

        }
    }
    public void stackLeakByThread(){
        while(true){
            Thread thread = new Thread (new Runnable(){

                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }
    public static void main(String[] args) {
        TestOOMOBject2 testOOMOBject2 =new TestOOMOBject2();
        testOOMOBject2.stackLeakByThread();
    }
}
