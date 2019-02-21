package Test;

/**
 * Author:weiwei
 * description:猴子分桃
 * Creat:2091/2/21
 **/
public class Monkey {
    public static void main(String[] args) {
        int n,number=20;
        float a=2;
        float b=1;
        float t,s=0;
        for(n=1;n<=number;n++){
            s=s+a/b;
            t=a;
            a=a+b;
            b=t;
        }
        System.out.printf("Sum is %9.6f\n",s);
    }
}
