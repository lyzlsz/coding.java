package TestOverride;

/**
 * Author:weiwei
 * description:向下转型
 * Creat:2019/3/29
 **/

class Person{
    public void print(){
        System.out.println("1.我是人类!");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.我是学生!");
    }
}
class Worker extends Person{
    public void print(){
        System.out.println("3.我是工人!");
    }
}
public class TestOverride5 {
    public static void main(String[] args) {
        whoAre(new Student());
        whoAre(new Worker());
    }
    public static void whoAre(Person per){
        per.print();
    }
}
