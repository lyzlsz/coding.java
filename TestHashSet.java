package Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * package:Test
 * Description:Set接口
 * @date:2019/6/10
 * @Author:weiwei
 **/
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Set<Integer> set1 = new TreeSet<>();
        set.add("C");
        set.add("C");
        set.add("A");
        set.add("B");
        set1.add(8080);
        set1.add(6);
        set1.add(1024);
        set1.add(3);
        set1.add(10);
        set1.add(1);
        set1.add(2);
        set1.add(2);
        System.out.println(set);
        System.out.println(set1);
    }
}
