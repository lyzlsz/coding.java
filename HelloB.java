package Thread;


/**
 * Author:weiwei
 * description:
 * Creat:2019/2/17
 **/
 class HelloA{
     public HelloA(){
        System.out.println("1.Hello A!父类构造方法");
    }
    {
        System.out.println("2.i am A class.父类非静态代码块");
    }
    static {
        System.out.println("3.static A 父类静态代码块");
    }

}
public class HelloB extends HelloA{
    public HelloB() {
         System.out.println("4. Hello B!构造方法");
     }
    {
        System.out.println("5. i am B class .非静态代码块");
    }
    static {
        System.out.println("6. static B 静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("7.--------start");
    new HelloB();
    new HelloA ();
     System.out.println("8.-----------end");
    }
 }