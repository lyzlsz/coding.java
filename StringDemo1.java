package Base;

/**
 * package:Base
 * Description:TODO
 *
 * @date:2019/7/15 0015
 * @Author:weiwei
 **/
public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab";
        String str3 = "c";
        String str4 = str2+str3;  //+ ->string ->StringBuilder.append()
        String str5 = str2+str3;
        String str6 = new String("abc");
        String str7 = "ab"+"c";
        String str8 = str2 + "c";
        System.out.println(str1 == str6);
        System.out.println(str1 == str4);
        System.out.println(str4 == str5);
        System.out.println(str1 == str7);//常量的+不会变成StringBuilder
    }
}
