package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/15
 **/
public class TestQuickSort {
    public static void main(String[] args) {
        int arr[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }

    //分治法
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);//将数组分为两部分,pivot枢纽
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        return arr;
    }


    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                --high;
                arr[low] = arr[high];
                while (low < high && arr[low] <= pivot) {
                    ++low;
                    arr[high] = arr[low];
                }
                arr[low] = pivot;
            }
        }
        return low;
    }
}


