package com.bittech.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Author:weiwei
 * Creat:2018/12/20
 **/
 //打印流
class PrintUtil{
    private OutputStream out;
    //由外部传入要输出的目标终端
    public PrintUtil(OutputStream out){
        this.out=out;
    }
    //核心功能就一个
    public void print(String str){
        try{
            this.out.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void println(String str){
        this.print(str+"\n");
    }
    public void print(int data){
        this.print(String.valueOf(data));
    }
    public void println(int data){
        this.println(String.valueOf(data));
    }
    public void print(double data){
        this.print(String.valueOf(data));
    }
    public void println(double data){
        this.println(String.valueOf(data));
    }
}
public class TestPrint {
    public static void main(String[] args) throws Exception {
        PrintUtil printUtil = new PrintUtil(new FileOutputStream(new File("/D/test/testprint")));
        printUtil.print("姓名: ");
        printUtil.println("Jack");
        printUtil.print("年龄 ");
        printUtil.println(27);
        printUtil.print("工资:");
        printUtil.println(1000000.0000088888);
    }
}
