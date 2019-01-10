package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/9
 **/
//Collections工具类
public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //相当于调用了三次add()方法
        Collections.addAll(list,"A","B","C");
        System.out.println(list);
        //集合反转
        Collections.reverse(list);
        System.out.println(list);
    }
}
