package com.bittech;

/**
 * Author:weiwei
 * Creat:2019/1/16
 **/

//传统工厂类引入反射
 interface IFruit{
     public void eat();
}
class Apple implements IFruit{

    @Override
    public void eat() {
        System.out.println("[Apple]吃苹果");
    }
}

class Orange implements IFruit{

    @Override
    public void eat() {
        System.out.println("[Orange]吃橙子");
    }
}
class FruitFactory{
     private FruitFactory(){}
     public static IFruit getInstance(String className){
         IFruit fruit =null;
         try{
             fruit=(IFruit) Class.forName(className).newInstance();
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         } catch (InstantiationException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
         return fruit;
     }
}

public class TestReflect2 {
    public static void main(String[] args) {
        IFruit fruit =FruitFactory.getInstance("www..bite.java.testThread.Orange");
        fruit.eat();
    }
}
