package reflect;

import java.lang.reflect.Field;

/**
 * Author:weiwei
 * Creat:2019/1/22
 **/

//调用类中属性
class Person{
    private String name;
    private int age;
}
class Student extends Person{
    private String school;
}
public class TestProperty {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("www.bit.java.testThread.student");{
                //普通代码块
                //取得类中所有属性
                Field[] fields = cls.getFields();
                for(Field field : fields){
                    System.out.println(field);
                }
            }
            System.out.println("-------------------");{
                //取得类中全部属性
                Field[] fields = cls.getDeclaredFields();
                for(Field field :fields){
                    System.out.println(field);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}