package interestingprogram;

import java.util.Scanner;

/**
 * Author:weiwei
 * description:汉诺塔问题
 * Creat:2019/2/15
 **/

public class Ch7_2 {
    static long count;    //移动次数
    /**参数n:圆盘数量
     * 参数a:起始地盘数
     * 参数b:辅助圆盘
     * 参数c:目的地圆盘
     */
    static void hanoi(int n,char a,char b,char c){//汉诺塔算法
        if(n==1){  //递归出口
            System.out.printf("第%d次移动\t圆盘从%c棒移动到%c棒\n",++count,a,c);
        }
        else{
            hanoi(n-1,a,c,b);   //递归调用
            System.out.printf("第%d次移动:\t圆盘从%c棒移动到%c棒\n",++count,a,c);
            hanoi(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        int n;
        count=0;
        System.out.printf("汉诺塔问题求解!\n");
        System.out.printf("请输入汉诺塔圆盘的数量:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();   //接受圆盘数量
        hanoi(n,'A','B','C');  //求解
        System.out.printf("求解完毕!总共需要%d步移动!\n",count);
    }
}
