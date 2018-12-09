package com.bittch;


import java.io.*;
import java.nio.file.Paths;

import java.util.Random;



/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class TestSystemIO {


    public static void code1() {
        //out输出的是希望用户看到的内容
        //err输出的是不希望用户看到的内容
        try {
            Integer value = Integer.parseInt("abc");
            System.out.println(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        }

    }

    public static void code2() {
        //outputStream输出的位置变成屏幕(控制台)
        OutputStream out = System.out;
        try {
            out.write("Hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void code3() {
        //利用inputStream实现数据输入
        InputStream in = System.in;
        byte[] buff = new byte[5];
        System.out.println("请输入内容:");
        try {
            int len = in.read(buff);
            System.out.println(new String(buff, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //因为数组长度有限.所以读取输入的数据的时候会出现阻塞.
        //如果输入的数据长度大于数组长度,那么只能接受部分数据
        //最好的方法的引入内存流来进行控制

    }


    public static void code4() {
        InputStream in = System.in;
        byte[] buff = new byte[5];
        System.out.println("请输入内容:");
        int len = -1;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            while ((len = in.read(buff)) != -1) {
                out.write(buff, 0, len);  //保存到内存流中
                //判断用户输入是否结束
                if (len < buff.length) {
                    break;
                }
            }
            System.out.println(new String(out.toByteArray()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //虽然解决了数组长度有限的问题,但整体实现逻辑过于混乱,容易出现乱码问题
    //最好的方法是将所有输入的数据保存到一起再处理,这样才不会出现乱码
    public static void main(String[] args) {

        //需求：借助BufferedReader实现点名程序
        //思路：
        // 1. 人员数据
        // 2. 人员读入到程序
        // 3. 生成随机数和人员关联
        // 4.输出目标人员
        //技术点：
        // 1. 爬虫
        // 2. I/O 字符流
        // 3. Random Array
        // 4. Out
        File studentDataFile = Paths.get("D:", "test", "student.txt").toFile();

        try (InputStream in = new FileInputStream(studentDataFile);
             Reader inputStreamReader = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {

            String line = null;
            String[] student = new String[10];
            int index = -1;
            while ((line = reader.readLine()) != null) {
                index++;
                student[index] = line;
            }
            Random random = new Random();
            int selectIndex = random.nextInt(student.length);
            System.out.println("您选择的学生是:" + student[selectIndex]);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


