package com.bittech;

import java.io.*;

/**
 * Author:weiwei
 * Creat:${Date}
 **/

class CopyFileUtil{
    private CopyFileUtil(){ //构造方法私有化
    }

    //判断要拷贝的源路径是否存在
    public static boolean fileIsExists(String path){
        return new File(path).exists();
    }

    //根据传入的路径判断父路径是否存在,若不存在,则创建
    public static void creatParentsDir(String path){
        File file =new File(path);
        if(!file.getParentFile().exists()){  //路径不存在
            file.getParentFile().mkdirs();   //创建多级父目录
        }
    }

    //文件拷贝
    public static boolean copyFile(String sourcepath,String destpath){
        File infile = new File(sourcepath);
        File outfile =new File(destpath);
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream =null;
        try{
            fileInputStream = new FileInputStream(infile);
            fileOutputStream =new FileOutputStream(outfile);
            cpoyFileHandle(fileInputStream,fileOutputStream);  //完成具体的文件拷贝处理
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    //实现具体的文件拷贝操作

    private static void cpoyFileHandle(InputStream inputStream, OutputStream outputStream)throws IOException{
        long start=System.currentTimeMillis();
        int temp=0;
        //InputStream 有读取单个字节的方法
        //OutPutStream 有输出单个字节的方法
        do{
            temp = inputStream.read();  //读取单个字节
            outputStream.write(temp); //通过输出流输出
        }while(temp != -1); //如果有数据就继续读取
        long end = System.currentTimeMillis();
        System.out.println("拷贝文件所花的时间:" +(end - start));
    }
}

public class CopyFile {
    public static void main(String[] args) {
        if(args.length !=2){  //参数不是两个
            System.out.println("非法操作,命令为java CopyFile 源文件路径 目标文件路径");
            return;
        }
        String sourcePath=args[0];  //取得源文件路径
        String destPath = args[1];  //取得目标文件路径
        if(CopyFileUtil.fileIsExists(sourcePath)){
            CopyFileUtil.creatParentsDir(sourcePath);
            System.out.println(CopyFileUtil.copyFile(sourcePath,destPath) ?"文件拷贝成功" : "文件拷贝失败");
        }else{
            System.out.println("源文件不存在,无法进行拷贝");
        }
    }
}
