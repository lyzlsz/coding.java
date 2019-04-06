package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:InsertionSort
 * Creat:2019/4/6
 **/
public class InsertionSort {
    public static int[] InsertionSort(int[] array){
        int len=array.length;
        int preIndex,current;
        for(int i=1;i<len;i++){
            preIndex=i-1;
            current=array[i];

            while(preIndex >=0 && array[preIndex] > current){
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1]=current;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] in ={5,2,8,1,9};
        System.out.println(Arrays.toString(InsertionSort(in)));
    }
}
