package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author:weiwei
 * Creat:2019/1/6
 **/

public class TestSet1 {
    public static void code1() {
        //HashSet使用
        Set<String> set = new HashSet<>();
        {                        //HashSet无序存储
            set.add("Hello");
            set.add("Hello");
            set.add("Hi");
            set.add("java");
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        //TreeSet有序存储,升序模式
        Set<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Java");//重复元素
        set.add("PHP");
        set.add("C++");
        set.add("C");
        System.out.println(set);
        }
}

