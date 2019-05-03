package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/3
 **/
public class HeapSort {

    private static void heapify(int[] array,int size,int index){
        //判断index是不是叶子节点
        while(2*index + 1 <size){
            //找到最大孩子的结点
            int max = 2 * index +1;
            if(max + 1 < size && array[max+1] > array[max]){
                max = 2*index +2;
            }
            //判断最大孩子的值和根的值
            if(array[index] < array[max]){
                swap(array,index,max);

                index = max;
            }else{
                //根的值比较大,不用交换,直接退出
                break;
            }
        }
    }
    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    private static void createHeap(int[] array){
        for(int i =(array.length-2)/2;i>=0;i--){
            heapify(array,array.length,i);
        }
    }
    private static int[] heapSort(int[] array){

        //1.建堆 大堆
        createHeap(array);

        //减治处理
        for(int i = 0;i<array.length;i++){
            swap(array,0,array.length-i-1);
            heapify(array,array.length-i-1,0);
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {8,3,7,1,4,6,2,9,5};
        System.out.println(Arrays.toString(heapSort(array)));
    }
}
