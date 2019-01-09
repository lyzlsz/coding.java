package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author:weiwei
 * Creat:2019/1/8
 **/
//Map集合使用Iterator输出
public class TestMap7 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"PHP");
        map.put(3,"Python");
        //将Map集合转为Set集合
        Set<Map.Entry <Integer,String>> set=map.entrySet();
        //获取Iterator对象
        Iterator<Map.Entry <Integer,String>> iterator = set.iterator();
        //输出
        while(iterator.hasNext()){
            //取出每一个Map.Entry对象
            Map.Entry<Integer,String> entry = iterator.next();
            //取得key和value
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
