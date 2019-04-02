//package Inner;
//
///**
// * Author:weiwei
// * description:静态内部类
// * Creat:2019/3/29
// **/
//
//class Outter{
//    private static String msg = "Hell World!";
//
//    static class Inner{//定义一个静态内部类
//        public void print(){//此时只能使用外部类中的static操作
//            System.out.println(msg);
//        }
//    }
//    public void fun(){
//        Inner inner = new Inner();
//        inner.print();
//    }
//}
//public class TestInner6 {
//    public static void main(String[] args) {
//        Outter.Inner inner = new Outter.Inner();
//        inner.print();
//    }
//}
