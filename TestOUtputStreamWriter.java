package com.bittech;

import java.io.*;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class TestOUtputStreamWriter {
    public static void main(String[] args) throws Exception {
        File file = new File(File.separator + "D:" +
                File.separator + "Test" + File.separator + "hello.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output=new FileOutputStream(file);
        Writer out=new OutputStreamWriter(output);
        String msg="你好";
        out.write(msg);
        out.close();
    }
}
