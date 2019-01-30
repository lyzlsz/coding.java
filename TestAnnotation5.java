package Annotation;

/**
 * Author:weiwei
 * description:取得某个具体的Annotation
 * Creat:2019/1/30
 **/

import com.sun.source.doctree.*;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/**
 * 自定义一个Annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    public String name() default "weiwei";
    public int age() default 22;
}
@Deprecated
@MyAnnotation
class Member implements SerialFieldTree {

    @Override
    public IdentifierTree getName() {
        return null;
    }

    @Override
    public ReferenceTree getType() {
        return null;
    }

    @Override
    public List<? extends DocTree> getDescription() {
        return null;
    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public Kind getKind() {
        return null;
    }

    @Override
    public <R, D> R accept(DocTreeVisitor<R, D> visitor, D data) {
        return null;
    }
}
public class TestAnnotation5 {
    public static void main(String[] args) {
        MyAnnotation ma = Member.class.getAnnotations(MyAnnotation.class);
        System.out.println("姓名:"+ma.name());
        System.out.println("年龄:"+ma.age());
    }
}
