package Thread;

/**
 * Author:weiwei
 * description:循环引用
 * Creat:2019/2/26
 **/
public class Test0226 {
    public Object instance = null;
    private static int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];
    public static void testGC() {
        Test0226 test1 = new Test0226();
        Test0226 test2 = new Test0226();
        test1.instance = test2;
        test2.instance = test1;
        test1 = null;
        test2 = null;
        // 强制jvm进行垃圾回收
        System.gc();
    }
    public static void main(String[] args) {
        testGC();
    }
}
