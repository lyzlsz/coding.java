package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/5
 **/
public interface IArrayList {
    //增 /删


    /**
     * 把item插入到线性表的前面
     * @param  item 要插入的数据
     */
    void pushFront(int item);

    /**
     * 把item插入到线性表的后面
     * @param item 要插入的数据
     */
    void pushBack(int item);

    /**
     * 把item插入到index下标位置处,index后的数据后移
     * @param temp
     * @param index
     */
    void add(int temp,int index);

    /**
     * 删除前面的数据
     */
    void popFront();

    /**
     * 删除后面的数据
     */
    void popBack();

    /**
     * 删除index处的数据,index后的数据往前移
     * @param index
     */
    void remove(int index);
}
