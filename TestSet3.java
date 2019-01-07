package Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/7
 **/
//集合输出
    //迭代输出:Iterator
public class TestSet3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        Iterator<String> iterator = list.iterator();//实例化Iterator对象
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
