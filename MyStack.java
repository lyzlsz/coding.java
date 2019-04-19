package com.bittech;

/**
 * Author:weiwei
 * description:顺序表类型的栈
 * Creat:2019/4/18
 **/
public class MyStack {
    private int[] array;
    int top;

    MyStack(){
        this.array=new int[100];
        this.top=0;
    }
    /**
     * 插入一个数据,压栈
     * @param v
     */
    public void push(int v){
        this.array[this.top++]=v;
    }

    /**
     * 出数组,弹栈,出栈
     * @return 栈顶元素
     */
    public  int pop(int v){
        return this.array[--this.top];
    }

    /**
     * 查看栈顶元素
     * @return 栈顶元素
     */
    public int peek(){
        return this.array[this.top-1];
    }
    public int size(){
        return this.top;
    }
    public boolean isEmpty(){
        return this.top == 0;
    }
}
