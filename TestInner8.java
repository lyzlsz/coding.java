package Inner;

/**
 * Author:weiwei
 * description:匿名内部类
 * Creat:2019/3/29
 **/


interface MyInterface{
    void test();
}
class Outter{
    private int num;
    void display(int para){
       //匿名内部类实现了MyInterface接口
        new MyInterface(){
            @Override
            public void test(){
                System.out.println("匿名内部类"+para);
            }
        }.test();
    }
}
public class TestInner8 {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.display(20);
    }
}
