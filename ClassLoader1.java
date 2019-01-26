package ClassLoader;

/**
 * Author:weiwei
 * description:ClassLoader类加载器
 * Creat:2019/1/26
 **/

class Member{}
public class ClassLoader1 {
    public static void main(String[] args) {
        Class<?> cls=Member.class;
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getClassLoader().getParent());
        System.out.println(cls.getClassLoader().getParent().getParent());
    }
}
