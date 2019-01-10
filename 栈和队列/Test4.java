package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author:weiwei
 * Creat:2019/1/9
 **/
//Stream流
public class Test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        //实例化对象
        Stream<String> stream = list.stream();
        List<String> resultList = stream.skip(0).limit(3).//输出从0到3的内容
                map((s) ->s.toUpperCase()).collect(Collectors.toList());  //转换为大写
        System.out.println(resultList);
    }
}
