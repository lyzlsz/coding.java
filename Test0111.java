package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/11
 **/


class Student{
    public String name;
    public char sex;
    public int no;
    public int age;
    Student(int cno,String cname,char csex,int cage){
        name=cname;
        sex=csex;
        no=cno;
        age=cage;
    }
    public void showNo(){
        System.out.println("No:"+no);
    }
    public void showName(){
        System.out.println("Name:"+name);
    }
    public void showSex(){
        System.out.println("Sex: "+sex);
    }
    public void showAge(){
        System.out.println("Age:"+age);
    }
}
class StudentScore{
    private int no;
    private double score;
    public void sendScore(int cno,double cscore){
        no=cno;
        score=cscore;
    }
    void printScore(){
        System.out.println("No:"+no+" score:" +score);
    }
}
public class Test0111 {
    public static void main(String[] args) {
        int m;
        Student st1=new Student(101,"jack",'F',18);
        Student st2=new Student(102,"Mike",'M',20);
        StudentScore sc1= new StudentScore();
        StudentScore sc2= new StudentScore();
        st1.showNo();
        st1.showName();
        st1.showAge();
        st1.age=20;
        m=st1.age;
        System.out.println("m="+m);
        st2.showNo();
        st2.showName();
        st1.showNo();
        st2.showName();
        sc1.sendScore(101,97);
        sc2.sendScore(102,88);
        sc1.printScore();
        sc2.printScore();
    }
}







