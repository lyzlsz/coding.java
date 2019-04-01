package Inner;

/**
 * Author:weiwei
 * description:
 * Creat:2019/3/29
 **/
//
//class Outer{
//    private String msg = "Hello World!";
//    public String  getMsg(){//通过此方法才能获得属性
//        return this.msg;
//    }
//    public void fun(){//现在由out对象调用了fun()方法
//        Inner inner = new Inner(this);//this表示当前对象
//        inner.print();
//    }
//}
//class Inner{
//    private Outer outer;
//    public Inner(Outer outer){//Inner.outer=main.outer
//        this.outer = outer;//引用传递
//    }
//    public void print(){
//        System.out.println(outer.getMsg());
//    }
//}
//public class TestInner2 {
//    public static void main(String[] args) {
//        Outer outer = new Outer();//实例化Outer对象
//        outer.fun();//调用outer类方法
//    }
//}
