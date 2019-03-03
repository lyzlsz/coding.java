package Thread;

/**
 * Author:weiwei
 * description:动态对象年龄判定
 * Creat:2019/3/3
 **/
public class Test0303 {
    private static final int _1MB = 1024 * 1024;
    @SuppressWarnings("unused")
    public static void testAllocation() {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[_1MB / 4];// allocation1+allocation2大于Survivor空间的一半
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }
    public static void main(String[] args) throws Exception{
        testAllocation();
    }
}
