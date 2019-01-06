package List;

import java.util.List;
import java.util.Vector;

/**
 * Author:weiwei
 * Creat:2019/1/6
 **/
//List的子类vector的使用
public class TestList2 {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Hello");
        list.add("Hi");
        list.add("hello");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}
