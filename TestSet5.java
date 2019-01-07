package Set;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Author:weiwei
 * Creat:2019/1/7
 **/
//ListIterator双向迭代

public class TestSet5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("C");
        ListIterator<String> listIterator =list.listIterator();
        System.out.print("从前往后输出");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+",");
        }
        System.out.print("\n从后往前输出");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+",");
        }
    }
}
