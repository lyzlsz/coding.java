package Teststatic;

/**
 * Author:weiwei
 * description:
 * Creat:${Date}
 **/

class Person{
    private static String country;
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void setCountry(String c){
        country=c;
    }
    public void getPersonInfo(){
        System.out.println("姓名:"+this.name+"年龄:"+this.age+"国家:"+this.country);
    }
}
public class static25 {
    public static void main(String[] args) {
        Person.setCountry("中国");
        Person person = new Person("张三",20);
        person.getPersonInfo();

    }
}
