package Base2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * package:Base2
 * Description:TODO
 * @date:2019/7/19
 * @Author:weiwei
 **/
public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        int [] result = new int[n*n];
        int x = 0;
        List<Integer> list = new ArrayList<>();
        for(int y=n-1;y>=0;y--){
            int x2 = x;
            int y2 = y;
            if(x2 != 0  && y2 != 0){
                list.add(arr[x2][y2]);
            }
            if(x2 != 0){
                y2--;
            }
            while(x2 < n && (y2 >= 0 &&y2 < n)){
                list.add(arr[x2][y2]);
                x2++;
                y2++;
            }
        }
        int y =0;
        for(int i=1;i<n;i++){
            int x3=i;
            int y3=y;
            list.add(arr[x3][y3]);
            x3++;
            y3++;
            while(x3 < n && (y3 >= 0 && y3 < n)){
                list.add(arr[x3][y3]);
                x3++;
                y3++;
            }
        }
        for(int i =0;i<list.size();i++){
            result[i] =list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
