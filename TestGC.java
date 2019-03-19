package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:${Date}
 **/
public class TestGC {
    public Object instance = null;
    private byte[] data = new byte[1024*1024*2];//2m

    public static void main(String[] args) {
        TestGC testGC = new TestGC();
        TestGC testGC2 = new TestGC();
        testGC.instance = testGC2;
        testGC2.instance = testGC;
        testGC = null;
        testGC2 = null;

        System.gc();
    }
}
