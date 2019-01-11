package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/11
 **/

class A1{
    int x=25;
    private int z;
}
class TestExtends extends A1{
    public static void main(String[] args) {
        TestExtends  p = new TestExtends();
        System.out.println("p.x="+p.x);
        //System.out.println("p.z="+p.z);//错,不能继承z因为z是私有的
    }
}

