package Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * Author:weiwei
 * Creat:2019/1/8
 **/
//Map集合
    //TreeMap的使用
public class TestMap4 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(4,"C++");
        map.put(1,"Java");
        map.put(3,"Python");  //按key值排序
        map.put(2,"PHP");
        System.out.println(map);
    }
}
