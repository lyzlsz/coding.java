package Thread;

/**
 * Author:weiwei
 * description:观察StackOverFlow异常(单线程环境下)
 * Creat:2019/3/8
 **/
public class Test038 {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) {
        Test038 test038 = new Test038();
        try{
            test038.stackLeak();
        }catch(Throwable e){
            System.out.println("Stack Length:"+ test038.stackLength);
            throw e;
        }
    }
}
