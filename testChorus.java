package Test0726;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * package:Test0726
 * Description:合唱团
 *
 * @date:2019/7/26
 * @Author:weiwei
 **/
public class testChorus {
    public static long result = Long.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //输入n值
        int[] nums = new int[n];//n表示数组元素个数
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();//输入能量值
        }
        int k = sc.nextInt();//k 选取人数
        int d = sc.nextInt();// 误差范围

        long[][] max = new long[n][k + 1];
        long[][] min = new long[n][k + 1];
        for (int i = 0; i < n; i++) {
            max[i][1] = nums[i];
            min[i][1] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= k; j++) {
                for (int r = Math.max(0, i - d); r < i; r++) {
                    min[i][j] = Math.min(min[i][j], Math.min(max[r][j - 1] * nums[i],min[r][j-1]*nums[i]));
                    max[i][j] = Math.max(max[i][j], Math.max(max[r][j - 1] * nums[i],min[r][j-1]*nums[i]));
                }
            }
        }
        for (int i = 0; i < n; i++){
            result = Math.max(result,Math.max(max[i][k],min[i][k]));
        }
        System.out.println(result);
    }
}

