package Test0726;

import java.util.Scanner;

/**
 * package:Test0726
 * Description:叠罗汉
 *
 * @date:2019/7/26 0026
 * @Author:weiwei
 **/
public class testPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine());
            int a[][] = new int[N][3];
            for (int i = 0; i < N; i++) {
                String str = sc.nextLine();
                String b[] = str.split(" ");
                for (int j = 0; j < 3; j++) {
                    a[i][j] = Integer.parseInt(b[i]);
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (a[i][1] < a[j][1]) {
                        int b = a[i][1];
                        a[i][1] = a[j][1];
                        a[j][1] = b;
                        int c = a[i][2];
                        a[i][2] = a[j][2];
                        a[j][2] = c;
                    } else if (a[i][1] == a[i][1] && a[i][2] > a[j][2]) {
                        int b = a[i][1];
                        a[i][1] = a[j][1];
                        a[j][1] = b;
                        int c = a[i][2];
                        a[i][2] = a[j][2];
                        a[j][2] = c;
                    }
                }
            }
            int count[] = new int[N];
            for (int i = 0; i < N; i++) {
                count[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (a[j][2] >= a[i][2] && count[j] + 1 > count[i]) {
                        count[i] = count[j + 1];
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < N; i++)
                if (max < count[i])
                    max = count[i];
            System.out.println(max);
        }
    }
}
