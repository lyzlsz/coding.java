package Inner;

/**
 * Author:weiwei
 * description:内部类可以直接访问外部类的元素
 * Creat:2019/3/29
 **/

//class Outter{
//    private String outName;
//    private int outAge;
//
//    class Inner{
//        private int InnerAge;
//        public Inner(){
//            Outter.this.outName = "I am Outter class";
//            Outter.this.outAge = 20;//内部类直接访问外部类属性
//        }
//        public void display(){
//            System.out.println(outName);
//            System.out.println(outAge);
//        }
//    }
//}
//public class TestInner4 {
//    public static void main(String[] args) {
//        Outter.Inner inner = new Outter().new Inner();
//        inner.display();
//    }
//}
