package com.bittech;

import java.io.File;
import java.util.Date;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class FilExam {

    //1.传入一个文件 File
    //2.打印输入如下内容
    //2.1 每一个文件一行
    //2.2  F|D name size last_modified

    public static void print(File f){
        if(f == null){
            return;
        }
        System.out.println((f.isFile() ? "F" :"D")+"   "+f.getName()+"     "
                +f.length()+"   "+new Date(f.lastModified()));
        File[] files=f.listFiles();
        if(files != null){
            for(File item : files) {
                System.out.println((item.isFile() ? "F" : "D") + "    " + item.getName()
                        + "    " + item.length() + "    " + new Date(item.lastModified()));
            }
        }

    }

    //1.递归遍历文件
    //2.输出格式：tree 目录
    public static void tree(File f){
        if(f == null){
            return;
        }
        if(f.isFile()) {
            System.out.println(f.getName());
        }else {
            File[] files=f.listFiles();
            if(files != null){
                for(File item : files){
                    tree(item);
                }
            }
        }
    }
    public static void main(String[] args){
        File file=new File("D:"+File.separator+"test");
    }




}
