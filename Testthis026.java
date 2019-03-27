package Testthis;

/**
 * Author:weiwei
 * description:this调用构造方法
 * Creat:2019/3/26
 **/

//class Person{
//    private String name;
//    private int age;
//
//    public Person(){
//        System.out.println("产生一个新的Person对象");
//    }
//    public Person(String name){
//        this();//调用本类无参构造
//        this.name = name;
//    }
//    public Person(String name,int age){
//        this(name);//调用本类有参构造
//        this.age = age;
//    }
//    public String getPersonInfo(){
//        return "姓名:"+name+",年龄:"+age;
//    }
//}
//public class Testthis026 {
//    public static void main(String[] args) {
//        Person per1= new Person();
//        Person per2 = new Person("Merry");
//        Person per3 = new Person("Jack",18);
//        System.out.println(per1.getPersonInfo());
//        System.out.println(per2.getPersonInfo());
//        System.out.println(per3.getPersonInfo());
//    }
//}
