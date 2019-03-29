//package Testextends;
//
///**
// * Author:weiwei
// * description:子类功能扩充
// * Creat:2019/3/27
// **/
//class Person{
//    private String name;
//    private int age;
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//class Student extends Person{//定义一个子类
//    private String school;//扩充新的属性
//
//    public String getSchool() {
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//}
//
//public class Testextends2 {
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Merry");
//        student.setAge(18);
//        student.setSchool("第一中学");
//        System.out.println("姓名:"+student.getName()+",年龄:"+student.getAge()+",学校:"
//                +student.getSchool());
//    }
//}
