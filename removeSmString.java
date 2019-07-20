package Base2;

import java.util.Scanner;

/**
 * package:Base2
 * Description:TODO
 *
 * @date:2019/7/19 0019
 * @Author:weiwei
 **/
public class removeSmString {
    public  static String removeAll(String str,char a){
        char[] arr = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<str.length();i++){
            if(arr[i] != a){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
    public static void removeAll2(String str1,String str2){
        char[] arrs = str2.toCharArray();
        for(int i =0;i<arrs.length;i++){
            if(str1.contains(arrs[i]+"")){
                str1 = removeAll(str1,arrs[i]);
            }
        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            removeAll2(str1,str2);
        }
    }
}
