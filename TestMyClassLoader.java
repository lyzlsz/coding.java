package ClassLoader;

/**
 * Author:weiwei
 * description:自定义类加载器
 * Creat:${Date}
 **/
public class TestMyClassLoader {
    public static void main(String[] args) throws Exception {
        /**
         * 自定义类加载器
         */
        System.out.println("自定义类加载器加载Member");
        MyClassLoader classLoader =new MyClassLoader();
        Class classes = classLoader.loadData("ClassLoader.Member");
        System.out.println(classes );//ClassLoader.Member
        System.out.println(classes.getClassLoader());//MyClassLoader
        System.out.println(classes.getClassLoader().getParent());//AppClassLoader
        System.out.println(classes.getClassLoader().getParent().getParent());//ExtClassLoader
        System.out.println(classes.getClassLoader().getParent().getParent().getParent());//Bootstrap null

        System.out.println("系统类加载器加载Member类");
        Class classes2= Member.class;
        System.out.println(classes2);//ClassLoader.Member
        System.out.println(classes2.getClassLoader());//App
        System.out.println(classes2.getClassLoader().getParent());
        System.out.println(classes2.getClassLoader().getParent().getParent());

        System.out.println("两个Class对象是否相等");
        System.out.println(classes  == classes2 );

    }
}
