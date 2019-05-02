package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/2
 **/
public class SelectSortBymySelf {

    private static int[] SelectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int t = array[min];
            array[min] = array[array.length - i - 1];
            array[array.length - i - 1] = t;

        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = {8,3,7,1,4,6,2,9,5};
        System.out.println(Arrays.toString(SelectSort(array)));
    }
}
