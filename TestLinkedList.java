package List;

import java.util.LinkedList;
import java.util.List;

/**
 * Author:weiwei
 * Creat2019/1/6
 **/
//LinkedList的使用
public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("Hi");
        System.out.println(list);
        list.remove("Hi");
        System.out.println(list);
    }
}
