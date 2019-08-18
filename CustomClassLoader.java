package com.peixinchen;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //"E:\\httpd\\webapp\\" + name + ".class";
        String filename = "E:\\httpd\\webapp\\HelloController.class";
        byte[] buf = new byte[8192];
        int len;
        try {
            len = new FileInputStream(filename).read(buf);
        } catch (IOException e) {
            throw new ClassNotFoundException("没找到", e);
        }

        return defineClass("HelloController", buf, 0, len);
    }
}
