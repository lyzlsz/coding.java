package Thread;

import java.util.Scanner;

/**
 * Author:weiwei
 * description:计算重复字符串长度
 * Creat:2019/3/7
 **/
public class Test037 {
    private static int statlen(String X,int k,int j){
        int cur_len = 0;
        while(k<X.length() && j<X.length() && X.charAt(k) == X.charAt(j)){
            k++;
            j++;
            cur_len++;
        }
        return cur_len;
    }
    //0(n^3)
    public static int naiveLRS(String x){
        int maxlen = 0;
        int length = x.length();
        for(int i =0;i<length;i++){
            int len =0;
            int k=i;//第一个游标k
            //第二个人游标j
            for(int j = i+1;j<length;j++){
                len = statlen(x,k,j);
                if(maxlen <len){
                    maxlen =len;
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        System.out.println(naiveLRS(X));
    }
}
