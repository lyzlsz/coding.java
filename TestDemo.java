package com.bittech.IO;

import java.io.*;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class TestDemo {
    public static void main(String[] args)throws IOException {
        String msg="hello world";
        //实例化InputStream类对象,实例化的时候需要将操作的数据保存到内存之中
        //最终读取的就是你设置的内容
        InputStream input =new ByteArrayInputStream(msg.getBytes());
        OutputStream output =new ByteArrayOutputStream();
        int temp=0;
        while((temp = input.read()) != -1){
            //每个字节进行处理,处理之后所有数据在OutputStream中
            output.write(Character.toUpperCase(temp));
        }
        //直接输出output对象
        System.out.println(output);
        input.close();
        output.close();
    }
}
