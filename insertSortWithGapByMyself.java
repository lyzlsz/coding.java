package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:希尔排序
 * Creat:2019/5/3
 **/
public class insertSortWithGap {

    private static void insertSortWithGap(int[] array, int gap) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - gap;
            for (; j >= 0 && key < array[j]; j = j - gap) {
                array[j + gap] = array[j];
            }
            array[j + gap] = key;
        }
    }

    /**
     * 时间复杂度:
     * 最好情况:O(n)
     * 最坏情况:O(n^2)   概率变小了
     * 平均情况:O(n^1.2 - 1.3)
     * 空间复杂度:O(1)
     * 稳定性:不稳定
     *
     * @param array
     */
    private static int[] shellSort(int[] array) {
        int gap = array.length;
        while (true) {
            //gap = gap /2;
            gap = (gap / 3) + 1;

            insertSortWithGap(array, gap);

            if (gap == 1) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {9,3,1,4,7,2,8,6,5};
        System.out.println(Arrays.toString(shellSort(array)));
    }
}

