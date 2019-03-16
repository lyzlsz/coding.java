/**
 * Author:weiwei
 * description:toString()方法
 * Creat:2019/3/16
 **/

//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString(){
//        return "姓名:"+this.name+",年龄"+this.age;
//    }
//}
//class Student{}
public class Test0316 {
    public static void main(String[] args) {
        String msg = "Hello"+new Person("zhangsan",22);
        System.out.println(msg);
    }
    public static void fun(Object obj){
        System.out.println(obj.toString());
    }
}
