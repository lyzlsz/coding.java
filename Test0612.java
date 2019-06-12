package Test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * package:Test
 * Description:TODO
 * @date:2019/6/12
 * @Author:weiwei
 **/
public class Test0612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(fun(str));
    }
    static int fun(String str){
        for(int i =0;i<str.length();i++){
            Set<String> rq = new TreeSet<>();
            for(int j =0;j<str.length()-i;j++){
                rq.add(str.substring(j,j+i));
            }
            if(rq.size() < Math.pow(4,i)){
                return i;
            }
        }
        return 1;
    }
}
