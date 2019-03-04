package Thread;

import java.util.Scanner;

/**
 * Author:weiwei
 * description:字符串是否由子字符串拼接
 * Creat:2019/3/4
 **/
public class Test0304 {
    public Scanner cin = new Scanner(System.in);

    Test0304() {
        while (cin.hasNext()) {
            String str = cin.next();
            int ans = str.length() - 1;
            for (int i = 0; ans > 0; ans--) {
                for (i = 0; str.length() % ans == 0 && i < str.length()
                        && str.charAt(i) == str.charAt(i & ans); i++) {
                }
                if (i == str.length())
                    break;
                }
                System.out.println(ans != 0 ? str.substring(0, ans) : "false");
            }
        }
        public static void main (String[]args){
            new Test0304();
        }
}


