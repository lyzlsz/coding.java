package reflect;

import java.lang.reflect.Field;

/**
 * Author:weiwei
 * Creat:2091/1/25
 **/

class Person{
    private String name;
}
public class TestProperty4 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("www.bite.java.reflectThread");
            //实例化本类对象
            Object obj = cls.newInstance();
            //操作name属性
            Field nameField=cls.getDeclaredField("name");
            //包,类
            System.out.println(nameField.getType().getName());
            //类名称
            System.out.println(nameField.getType().getSimpleName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
