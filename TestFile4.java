package com.bittech;

import java.io.File;
import java.io.IOException;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/27
 * @Author:weiwei
 **/
public class TestFile4 {
    public static void main(String[] args) throws IOException {
        //要操作的文件
        File file = new File(File.separator + "E:" + File.separator +
                "code" + File.separator + "classcode");
        //保证文件存在再进行操作
        if (file.exists() && file.isDirectory()) {
            //列出目录中的所有内容
            File[] result = file.listFiles();
            for (File file2 : result) {
                System.out.println(file2);
            }
        }
    }
}
