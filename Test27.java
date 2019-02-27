package Thread;

/**
 * Author:weiwei
 * description:观察新生代GC
 * Creat:2019/2/27
 **/
public class Test27 {
    private static final int _1MB = 1024 * 1024;
    public static void testAllocation() {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
// 出现Minor GC
        allocation4 = new byte[4 * _1MB];
    }
    public static void main(String[] args) throws Exception{
        testAllocation();
    }
}
