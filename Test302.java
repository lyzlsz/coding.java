package Thread;

/**
 * Author:weiwei
 * description:长期存活的对象进入老年代
 * Creat:2019/3/2
 **/
public class Test302 {
    private static final int _1MB = 1024 * 1024;
    @SuppressWarnings("unused")
    public static void testAllocation() {
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB/4];
        // 什么时候进入老年代取决于XX:MaxTenuringThreshold的设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
    public static void main(String[] args) throws Exception{
        testAllocation();
    }
}
