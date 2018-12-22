package com.bittech;

import java.lang.reflect.Field;

/**
 * Author:weiwei
 * Creat:2018/12/22
 **/

class MyClass <T,E>{
    private T message;
    private E text;

    public E getText() {
        return text;
    }
    public void setText(E text){
        this.text=text;
    }
    public T getMessage(){
        return message;
    }
    public void setMessage(T message){
        this.message=message;
    }
    public void testMethod1(T t){
        System.out.println(t);
    }
}
public class Test {
    public static void main(String[] args) {
        MyClass<String,Integer> myClass1=new MyClass<>();
        Class cls= myClass1.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getType());
        }
    }

}
