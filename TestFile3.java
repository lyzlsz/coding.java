package com.bittech;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Date;

/**
 * package:com.bittech
 * Description:取得文件信息
 * @date:2019/6/27
 * @Author:weiwei
 **/
public class TestFile3 {
    public static void main(String[] args) throws IOException {
        //要操作的文件
        File file = new File(File.separator + "E:" + File.separator +
                "code" + File.separator + "classcode" + File.separator + "Test.java");
        //保证文件存在再进行操作
        if (file.exists() && file.isFile()) {
            System.out.println("文件大小" + file.length());
            System.out.println("最后一次修改日期" + new Date(file.lastModified()));
        }
    }
}
