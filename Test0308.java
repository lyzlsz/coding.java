package Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * description:Java Heap OOM
 * Creat:2019/3/8
 **/
public class Test0308 {
    static class OOMObject{

    }
    public static void main(String[] args) {
        List<OOMObject> list =
                new ArrayList<>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
