package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/25
 **/
public class adjustUp {

    /**
     * 向上调整(大堆)
     * 向上调整只需要考虑双亲结点
     * @param array
     * @param size
     * @param index
     */
    private void adjustUp(int[] array,int size,int index){

        while(index > 0){
            int parent = (index - 1)/2;
            if(array[parent] >= array[index]){
                break;  //如果双亲结点大于等于下标,就说明满足大堆的性质,不需要交换,break
            }

            //否则,交换
            int t = array[parent];
            array[parent] = array[index];
            array[index] = t;

            //继续向下调整
            index = parent;
        }
    }
}
