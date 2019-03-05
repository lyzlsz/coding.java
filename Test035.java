package Thread;

import java.util.Scanner;

/**
 * Author:weiwei
 * description:二进制个位不同个数
 * Creat:2019/3/5
 **/
public class Test035 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num = n ^ m;
        int count = 0;
        while(num != 0){
            count++;
            num = (num - 1) & num;
        }
        System.out.println(count);
    }
}
