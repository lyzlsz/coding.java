package Set;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * Creat:2019/1/7
 **/
//foreach输出
public class TestSet7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("VB");
        for(String str : list){
            System.out.println(str);
        }
    }
}
