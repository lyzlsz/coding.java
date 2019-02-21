package Test;

/**
 * Author:weiwei
 * description:平方回文素数
 * Creat:2019/2/21
 **/
public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("1000以内的平方回文素数如下: ");
        for(int i=2;i<=1000;i++){
            if(prime(i) == 1 && pa(i*i)==1){
                System.out.println(i+"*"+i+"="+i*i);
            }
        }
        System.out.printf("\n");
    }
    static int prime(int a){
        for(int i=2;i<=java.lang.Math.sqrt(a);i++){   //循环整除
            if(a%i == 0)
                return 0;
    }
    return 1;
}
static String trans(int bk){
    int a=bk;
    String res = "";
    while(a != 0){
        int b= a%10;
        res = b+res;
        a=a/10;
    }
    return res;
}
static int pa(int a){
        String str =trans(a);
        int ls = str.length();
        for(int i=0;i<ls;i++){
            if(str.codePointAt(i) != str.codePointAt(ls - 1 - i)){
                return 0;
            }
        }
        return 1;
    }
}
