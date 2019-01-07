package Set;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Author:weiwei
 * Creat:2019/1/7
 **/
//Enumeration枚举输出
public class TestSet6 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("PHP");
        vector.add("C++");
        vector.add("C");
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
