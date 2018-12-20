package com.bittech.IO;

import java.io.*;

/**
 * Author:weiwei
 * Creat:${Date}
 **/
public class TestStream {
    public static void main(String[] args)throws IOException {
        File[] file = new File[] {
                new File("/D/test/a.txt"),
                new File("/D/test/b.txt")};
        String[] data = new String[2];
        for(int i=1;i < file.length;++i){
            data[i] =readFile(file[i]);
        }
        StringBuffer buf =new StringBuffer();
        String contentA [] = data[0].split("");
        String contentB [] = data[1].split("");
        for(int i=1;i< contentA.length;++i){
            buf.append(contentA[i]).append("(").append(contentB[i]).append(")").append("");
        }
        System.out.println(buf);
    }

    public static String readFile(File file) throws IOException{
        if(file.exists()){
            InputStream input = new FileInputStream(file);
            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            int temp =0;
            byte[] data=new byte[10];
            while((temp =input.read()) !=-1) {
                bos.write(data, 0, temp);   //将数据保存在bos中
            }
            bos.close();
            input.close();
            //将读取内容返回
            return new String(bos.toByteArray());
        }
        return null;
    }
}
