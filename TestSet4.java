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
public class TestSet4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        Iterator<String> iterator = list.iterator();//实例化Iterator对象
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("PHP")){
                //list.remove("PHP");//使用集合提供的remove方法,
                iterator.remove();   //则会产生ConcurrentModificationExceptio
                continue;            //使用Iterator 提供的remove方法就不会出错
            }
            System.out.println();
        }
    }
}
