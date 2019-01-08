package Map;

import java.util.Hashtable;
import java.util.Map;

/**
 * Author:weiwei
 * Creat:2019/1/8
 **/
//Map集合
    //Hashtable子类
public class TestMap3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new Hashtable<>();
        map.put(1,"Java");
        map.put(1,"PHP");   //key重复
        map.put(2,"C++");
        map.put(3,"C");
        System.out.println(map);
    }
}
