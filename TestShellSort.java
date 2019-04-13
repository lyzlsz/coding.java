package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:shellsort
 * Creat:2019/4/13
 **/
public class TestShellSort {
    public static void main(String[] args) {
        int[] in = { 3, 5, 8, 1, 0 };
        System.out.println(Arrays.toString(shellSort(in)));
    }

    public static int[] shellSort(int[] data) {
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < data.length; i++) {
                // System.out.println("i:" + i);
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    // System.out.println("j:" + j);
                    // System.out.println("temp:" + temp);
                    // System.out.println("data[" + j + "]:" + data[j]);
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }
        }
        return data;
    }
}
