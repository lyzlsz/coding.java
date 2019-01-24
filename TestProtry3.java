package reflect;

import java.lang.reflect.Field;

/**
 * Author:weiwei
 * Creat:2019/1/24
 **/
public class TestProtry3 {
    //Constructor
    public static void main(String[] args) {
        try{
            Class classz= Class.forName("com.bittech.reflect.Student");
            //获取public 属性
            System.out.println("输出Student类的所有公开属性:");
            for(Field f : classz.getFields()){
                System.out.println(f);
            }
            System.out.println("输出Student类的本类声明的属性");
            for(Field f:classz.getDeclaredFields()){
                System.out.println(f);
            }
            System.out.println("获取指定属性");
            Field major = classz.getDeclaredField("major");
            System.out.println(major);

            //student一个对象
            Student student=(Student) classz.newInstance();
            System.out.println("实例化后的信息: "+student);
            major.setAccessible(true);
            major.set(student,"计算机与科学");
            System.out.println("通过major Field赋值之后: "+student);
            Object value = major.get(student);
            System.out.println("通过major Field获取值: "+value);

            //获取Filed
            System.out.println(major.getType());


    } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
class Person {

    public String name;
    private Integer age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {

    private String teacher;

    private String major;

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }
}
