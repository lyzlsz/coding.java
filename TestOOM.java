package com.bittech;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * description:OOM堆溢出
 * Creat:2019/3/19
 **/
public class TestOOM {

    static  class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> data = new ArrayList<>();
        while(true){
            data.add(new OOMObject());
        }
    }
}
