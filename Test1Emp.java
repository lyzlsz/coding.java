package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/22
 **/

class Emp{
    private String ename;
    private String job;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString(){
        return "Emp{"+"ename='"+ename+"\'"+",job='"+job+"\'"+"}";
    }
}
public class Test1Emp {
    public static void main(String[] args) {
        Emp emp= new Emp();
        emp.getEname();
        emp.getJob();
        emp.setEname("Hello");
        emp.setJob("java coder");
        System.out.println(emp);
    }
}
