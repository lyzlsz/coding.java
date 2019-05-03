package Sort;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/3
 **/
public class insertSort {

    /**遍历查找
     *先查找
     *再搬
     * @param array
     */
    private static void insertSort1(int[] array){
        for(int i =0;i<array.length;i++){
            //有序[0,i)
            //无序[i,array.length)
            //1.在有序区间遍历查找,从后往前查找
            int j;
            for(j=i-1;j >= 0 &&array[i] < array[j];j--){
            }
            //j+1就是要插入的位置
            //插入数据,从后往前搬数据
            int pos = j+1;
            int key = array[i];
            for( int k = i;k>pos;k++){
                array[k] = array[k-1];
            }
            array[pos] = key;
        }
    }

    /**遍历查找
     * 边查找边搬
     * @param array
     */
    private static int[] insertSort2(int[] array){
        int len = array.length;
        int preIndex,current;
        for(int i = 1;i<len;i++){
            preIndex = i+1;
            current = array[i];

            while(preIndex >= 0 && array[preIndex] > current ){
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = current;
        }
        return array;
    }

    /**
     * 二分查找(重点)
     * @param array
     */
    private static void insertSort3(int[] array){
        for(int i = 0;i<array.length;i++){
            int key = array[i];
            //[0,i)
            int left = 0;
            int right = i;

            while(left < right){
                int mid = left + (left - right)/2;
                if(key == array[mid]){
                    left = mid + 1;
                }else if(key < array[mid]){
                    right = mid;
                }else{
                    left = mid +1;
                }
            }
            int pos = left;
            for (int k = i;k>pos;k--){
                array[k] = array[k-1];
            }
            array[pos] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {9,2,7,4,5,3,1,8,6,5};
        System.out.println(Arrays.toString(insertSort2(array)));
    }


}
