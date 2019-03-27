package Testthis;

/**
 * Author:weiwei
 * description:this表示当前对象
 * Creat:2019/3/26
 **/

class Person{
    public void print(){
        System.out.println("[PIRNT]方法"+this);
    }
}
public class Testthis032 {
    public static void main(String[] args) {
        Person per1 = new Person();
        System.out.println("[MAIN]方法"+per1);
        per1.print();
        System.out.println("===============");
        Person per2 = new Person();
        System.out.println("[MAIN]方法"+per2);
        per2.print();
    }
}
