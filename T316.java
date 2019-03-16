/**
 * Author:weiwei
 * description:Object类的对象比较
 * Creat:2019/3/16
 **/

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "姓名:"+this.name+",年龄"+this.age;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        //不是Person类对象
        if(!(obj instanceof Person)){
            return false;
        }
        Person person =(Person)obj;//向下转型,比较属性值
        return this.name.equals(person.name) && this.age == person.age;
    }
}
class Student{}
public class T316 {
    public static void main(String[] args) {
        Person per1 = new Person("张三",22);
        Person per2 = new Person("李四",23);
        System.out.println(per1.equals(per2));
    }
}
