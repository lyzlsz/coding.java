package com.bittech;

import java.io.File;
import java.io.IOException;

/**
 * package:com.bittech
 * Description:创建父目录
 * @date:2019/6/27
 * @Author:weiwei
 **/
public class TestFile2 {
    public static void main(String[] args)throws IOException {
        File file = new File(File.separator+"E:"+File.separator+
                "code"+File.separator+"classcode"+File.separator+"Test.java");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();//创建父目录
        }
        if(file.exists()){
            file.delete();
        }else{
            file.createNewFile();
        }
    }
}
