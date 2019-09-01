package com.store.frank.utils;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2019年07月29日 11:23
 * @Description: 图像处理工具类
 */
public class ImageTools {

    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/8/3 0003 下午 8:34
     * @Description: 根据文件名称获取文件的base64编码字符串
     */
    public static String getImageBase64Str(String imageName){
        String imageBase64Str=null;
        // 根据文件名称获取本地存储的文件
        // 获取image的绝对路径。工程名+image
        String imagePath=getImagePath();
        // 根据文件名称和文件路径构建file对象
        File file=new File(imagePath,imageName);
        try {
            // 获取文件的输入流
            InputStream in=new FileInputStream(file);
            byte[] data=IOUtils.toByteArray(in);
            // 进行base64编码
            imageBase64Str=Base64.getEncoder().encodeToString(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imageBase64Str;
    }
    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/8/3 0003 下午 8:41
     * @Description: 获取image文件夹的绝对路径。
     * 如果该目录不存在则创建该目录。
     */
    private static String getImagePath() {
        String imagePath=null;
        String temp=getProjectPath()+"image";
        File directory=new File(temp);
        if(directory.exists()){
            imagePath=temp;
            System.out.println("image目录已存在");
        }else{
            // 创建目录
            boolean flag=directory.mkdirs();
            if(flag){
                System.out.println("image目录创建成功");
                imagePath=temp;
            }else{
                throw new RuntimeException("image目录创建失败");
            }
        }
        return imagePath;
    }

    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/8/3 0003 下午 8:41
     * @Description: 获取项目的绝对路径。
     */
    private static String getProjectPath() {
        String projectPath=ImageTools.class.getResource("/").toString();
        projectPath=projectPath.substring(6,projectPath.indexOf("target"));
        return projectPath;
    }













































    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/29 11:29
     * @Description: 保存图像方法，保存后返回图像名称
     * @param part
     * @return
     */
    public static String saveImage(Part part) throws IOException {
        // 获取文件保存位置
        String storePath=getImagePath();
        // 获取文件的新名称，即加密为base64后的字符串
        String temp=System.currentTimeMillis()+"";
        // 获取文件输入流，在part对象中
        InputStream in= part.getInputStream();
        // 构建输出文件，即该文件只是个空壳子，将in写入到该文件后就是最终的文件
        File file=new File(storePath,temp);
        OutputStream out= new FileOutputStream(file);
        IOUtils.write(IOUtils.toByteArray(in),out);
        // 文件保存成功后将名称赋给newFileName
        String newFileName=temp;
        return newFileName;
    }


    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/29 12:04
     * @Description: 根据文件路径读取文件内容到输入流
     */
    public static String readImageStr(String fileName){
        String result=null;
        // 构建输入流文件对象
        File file=new File(getImagePath(),fileName);
        try {
            // 构建输入流
            InputStream in=new FileInputStream(file);
            byte[] data=IOUtils.toByteArray(in);
            result=Base64.getEncoder().encodeToString(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static byte[] readImage(String fileName){
        byte[] data=null;
        // 构建输入流文件对象
        File file=new File(getImagePath(),fileName);
        try {
            // 构建输入流
            InputStream in=new FileInputStream(file);
            data=IOUtils.toByteArray(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
