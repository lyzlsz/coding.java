package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/26
 **/
public class Heap {

    /**
     * 向下调整(堆化)大堆
     * 必须满足可以向下调整的前提:只有一个位置不满足堆
     * @param tree 完全二叉树的数组
     * @param index 要调整位置的下标
     */
    private static void heapify(int[] tree,int size,int index){

        /**
         * 判断index位置是不是叶子结点
         * 完全二叉树可以只判断有没有左孩子
         * 转化成数组下标越界的问题去处理
         */
        int left = 2*index+1;
        if(left >= size){
            return;  //如果左边的长度大于等于数组长度,就说明是叶子结点,没有左孩子
        }


        /**
         *否则,不是叶子结点就一定有左孩子,但不一定有右孩子
         * 找到最大的一个孩子
         * 没有右孩子,就去左孩子找
         * 有右孩子
         *    1.左边大   左孩子
         *    2.右边大   右孩子
         */
        int right = 2*index+2;
        int max = left;//假设大的数在左边
        if(right >size && tree[right] > tree[left]){
            max=right;
        }

        /**
         * 和根的值进行比较
         * 如果比根的值大,满足堆的性质,不需要调整
         * 否则,交换数组中两个下标的值
         * 并且继续以max作为下标,继续向下调整
         */

        if(tree[index] >= tree[max]){
            return;
        }            //不需要调整

        /**
         * 根的值比较小,先交换,
         */
        int t = tree[index];
        tree[index] = tree[max];
        tree[max] = t;

        //继续向下调整
        heapify(tree,size,max);
    }

    private static void ctreaHeap(int[] array,int size){
        //从最后一个非叶子结点的下标开始,一路向下调整至根的位置
        for(int i = (size - 2)/2;i >+ 0; i--){
            heapify(array,size,i);
        }
    }
    int size;
    public int getSize(){
        return size;
    }
}
