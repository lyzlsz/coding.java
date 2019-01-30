package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author:weiwei
 * description:用注解的形式配置工厂类
 * Creat:2019/1/30
 **/

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    public Class<?> target();
}
interface IFruit{
    public void eat();
}
class Apple implements IFruit {

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
@MyAnnotation(target =Apple.class)
class Factory{
    public static <T> T getInatance()throws Exception {
        MyAnnotation mt=Factory.class.getAnnotations(MyAnnotation.class);
        return (T) mt.target().newInstance();
    }
}
public class TestAnnotation6 {
    public static void main(String[] args)throws Exception  {
        IFruit fruit =Factory.getInatance();
        fruit.eat();
    }
}
