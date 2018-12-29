package com.bittech;

/**
 * Author:weiwei
 * Creat:2018/12/29
 **/
class Person <T> {
    @Deprecated
    public Person(){}
    public Person(String name){}
    @Deprecated
    public void fun(){}
}
public class TestWarnings {
    @SuppressWarnings({"rawtypes","unused"})
    public static void main(String[] args) {
        Person person = new Person();

    }
}
