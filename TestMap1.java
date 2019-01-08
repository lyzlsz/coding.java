package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:weiwei
 * Creat:2019/1/8
 **/
//Map集合
    //HashMap子类
public class TestMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"PHP");
        map.put(3,"C++");
        map.put(4,"C");
        map.put(4,"C#"); //key重复
        System.out.println(map);
        System.out.println(map.get(2));  //通过key找到value的内容
        System.out.println(map.get(99)); //找不到返回null
    }
}
