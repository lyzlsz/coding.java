package interestingprogram;

import java.util.Scanner;

/**
 * Author:weiwei
 * description:趣味编程---金字塔图案
 * Creat:2019/2/3
 **/
public class Ch1_1 {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金字塔层数: ");
        n = input.nextInt();
        //外层循环控制层数
        for (i = 1; i <= n; i++) {
            //根据外层行号,输出星号左边空格
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");
                //根据外层行号.输出星号个数
                for (k = 1; k <= 2 * i - 1; k++)
                    System.out.printf("*");
                    //一行结束,换行
                    System.out.printf("\n");
                }
            }
}

