package ClassLoader;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Author:weiwei
 * description:ClassLoader类加载器--自定义类加载器
 * Creat:2019/1/27
 **/

class MyClassLoader extends ClassLoader1{
    public Class<?> loadData(String className)throws Exception{
        byte[]  classData = this.loadClassData();
        return super.defineClass(className,classData,0,classData.length);
    }

    private byte[] loadClassData()throws Exception  {
        InputStream input = newFileInputStream("/D/pc/Member.class");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte [] data= new byte[20];
        int temp=0;
        while((temp = input.read(data))!= -1){
            bos.write(data,0,temp);
        }
        byte [] result = bos.toByteArray();
        input.close();
        bos.close();
        return result;
    }

    private   InputStream newFileInputStream(String s) {
        return  null;
    }
}
public class LoadClass {
    public static void main(String[] args) throws Exception {
        Class <?> cls = new MyClassLoader().loadData("Member");
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getClassLoader().getParent());
        System.out.println(cls.getClassLoader().getParent().getParent());
        System.out.println(cls.newInstance());
    }
}
