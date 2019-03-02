package Thread;

/**
 * Author:weiwei
 * description:观察大对象直接进入老年代
 * Creat:2019/3/2
 **/
public class Test0302 {
    private static final int _1MB = 1024 * 1024;
    public static void testAllocation() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }
    public static void main(String[] args) throws Exception{
        testAllocation();
    }
}
