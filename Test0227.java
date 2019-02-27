package Thread;

/**
 * Author:weiwei
 * description::对象自我拯救
 * Creat:2019/2/27
 **/
public class Test0227 {
    public static Test0227 test;
    public void isAlive() {
        System.out.println("I am alive :)");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        test = this;
    }
    public static void main(String[] args)throws Exception {
        test = new Test0227();
        test = null;
        System.gc();
        Thread.sleep(500);
        if (test != null) {
            test.isAlive();
        }else {
            System.out.println("no,I am dead :(");
        }
// 下面代码与上面完全一致，但是此次自救失败
        test = null;
        System.gc();
        Thread.sleep(500);
        if (test != null) {
            test.isAlive();
        }else {
            System.out.println("no,I am dead :(");
        }
    }
}
