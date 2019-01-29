package Annotation;

/**
 * Author:weiwei
 * description:定义一个在运行时生效的Annotation
 * Creat:2019/1/29
 **/

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义一个Annotation
 */
@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation{
    public String name();
    public int age();
}

@Deprecated
@MyAnnotation(name="weiwei",age=22)
class Member implements Serializable {
}

public class TestAnnotation3 {
    public static void main(String[] args) {
        Annotation [] ant = new Annotation[0];
        ant= Member.class.getAnnotations();
        for(Annotation a :ant ){
            System.out.println(a);
        }
    }
}
