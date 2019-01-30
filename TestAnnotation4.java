package Annotation;

/**
 * Author:weiwei
 * description:使用默认值自定义Annotation
 * Creat:2019/1/30
 **/

import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.DocTreeVisitor;
import com.sun.source.doctree.SerialDataTree;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/**
 * 自定义一个Annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    public String name() default"weiwei";
    public int age() default  22;
}
@Deprecated
@MyAnnotation
class Member implements SerialDataTree {
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

public class TestAnnotation4 {
    public static void main(String[] args) {
        Annotation [] ant=new Annotation[0];
        ant=Member.class.getAnnotations();
        for(Annotation a:ant){
            System.out.println(a);
        }

    }

}
