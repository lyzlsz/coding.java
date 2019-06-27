package com.bittech;

import java.io.File;
import java.io.IOException;

/**
 * package:com.bittech
 * Description:creat/delete File
 * @date:2019/6/27
 * @Author:weiwei
 **/
public class TestFile1 {
    public static void main(String[] args)throws IOException {
        //定义要操作的文件路径
        File file = new File("E:\\code/Test.java");
        if(file.exists()){
            //文件存在,进行删除
            file.delete();
        }else{
            file.createNewFile();
        }
    }
}
