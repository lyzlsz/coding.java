package Array;

/**
 * Author:weiwei
 * description:静态数组初始化
 * Creat:2019/3/22
 **/
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println("姓名"+this.name+",年龄:"+this.age);
    }
}
public class TestObject2 {
    public static void main(String[] args) {
        Person[] per = new Person[]{
            new Person("zhangsan", 22),
            new Person("lisi", 23),
            new Person("wangwu", 18),
        };
        //对象数组静态数组初始化
        for (int i = 0; i < per.length; i++) {
            per[i].getInfo();
        }
    }
}
