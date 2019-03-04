package Thread;

import java.util.Scanner;

/**
 * Author:weiwei
 * description:序列找数
 * Creat:2019/3/4
 **/
public class Test034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 0){
            StringBuilder b = new StringBuilder();
            for(int i=0;i<n;i++){
                b.append(sc.nextInt());
            }
            findNoNumber(b.toString());
        }
    }
    /**
     * 找到未出现在该子序列中的数
     */
    private static void findNoNumber(String s){
        if(s == null || s.length() == 0)
            return;
        for(int i = 0;i<s.length();i++){
            if(!s.contains(" "+i+" ")){
                System.out.println(i);
                return;
            }
        }
    }
}
