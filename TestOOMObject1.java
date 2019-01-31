package com.bittech;

/**
 * Author:weiwei
 * description:观察StackOverFlow异常(单线程环境下)
 * Creat:2019/1/31
 **/

/**
 * JVM参数为:-Xss128k
 * @author 38134
 *
 */
public class TestOOMObject1 {
    private int stackLength=1;
    public void stackLeak(){
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        TestOOMObject1  testOOMObject =new TestOOMObject1();
        try{
            testOOMObject.stackLeak();
        }catch(Throwable e){
            System.out.println("Stack Length:"+testOOMObject.stackLength);
            throw e;
        }
    }
}
