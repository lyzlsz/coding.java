package com.bittech;

/**
 * Author:weiwei
 * description:堆排序
 * Creat:2019/4/27
 **/
public class heapSort {

    private static void heapify(int[] array,int size,int index){
        //判断index是不是叶子结点
        while(2*index+1 < size){
            //找到最大孩子的下标
            int max = 2 * index + 1;
            if(max + 1 <size && array[max+1] > array[max]){
                max = 2 * index + 2;
            }

            //3.判断最大得孩子和根的值
            if(array[index] < array[max]){
                swap(array,index,max);

                index = max;
            }else{
                //根的值比较大,不需要交换,可以直接退出了
                break;
            }
        }
    }
    private static void createHeap(int[] array){
        //[从最后一个非叶子节点的下标,根]  向下调整
        //[(array.length-2)/2,0]
        for(int i = (array.length-2/2);i>=0;i--){
            heapify(array,array.length,i);
        }
    }
    private static void swap(int[] array,int i,int j){
        int t =array[i];
        array[i] = array[j];
        array[j] = t;

    }
    private static void heapSort(int[] array){
        //建堆  大堆
        createHeap(array);

        //减治处理
        for(int i =0;i<array.length;i++){
            //有序[length - i,length]
            //无序[0,length - i - 1]
            //最大的数在[0],最大的数应该放到的下标是
            //[length-i-1]
            swap(array,0,array.length -1-i);
            //处理[0]无序剩余部分满足堆的性质
            //无序[0,length-i-2]
            //有序[length-i-1,length]
            //size剩余无序部分的长度
            heapify(array,array.length-1-i,0);
        }
    }

    public static void main(String[] args) {
        int[] array = { 9, 5, 2, 7, 3, 6, 8, 8, 4, 9, 3, 1, 2 };
        heapSort(array);
        for (int item: array) {
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
