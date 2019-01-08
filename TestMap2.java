package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author:weiwei
 * Creat:2019/1/8
 **/
//Map集合
    //HashMap  取得Map中所有Key信息
public class TestMap2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(1,"PHP");   //key重复
        map.put(2,"C++");
        map.put(3,"C");
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
