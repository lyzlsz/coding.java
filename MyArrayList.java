package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/5
 **/
public class MyArrayList implements IArrayList {
    private int[] array;//保存数据的空间
    private int size;//保存有效数据的个数

    MyArrayList (int capacity){
        this.array=new int[capacity];
        this.size = 0;
    }
    //O(n)
    @Override
    public void pushFront(int item) {
        ensureCapacity();
        //将顺序中已有的数据往后移一个
        for(int i=this.size;i>=1;i--){
            this.array[i]=this.array[i-1];
        }
        this.array[0]=item;
        this.size++;
    }

    //O(1)
    @Override
    public void pushBack(int item) {
        ensureCapacity();
        this.array[this.size]=item;
        this.size++;
    }


    @Override
    public void add(int item, int index) {
        if (index < 0 || index > this.size) {
            throw new Error();

        }
            ensureCapacity();
            //i代表数据所在的下标
            for (int i = this.size - 1; i >= index; i--) {
                this.array[i + 1] = this.array[i];
            }
            this.array[index] = item;
            this.size++;
        }



    @Override
    public void popFront() {
        if(this.size==0){
            throw new Error();
        }
        for(int i=0;i<this.size;i++){
            this.array[i-1]=this.array[i];
        }
        this.array[--this.size]=0;
    }

    //O(1)
    @Override
    public void popBack() {
        if(this.size == 0) {
            throw new Error();
        }
            this.array[--this.size]=0;
    }


    //O(n)
    @Override
    public void remove(int index) {
        if(index<0 || index >= this.size){
            throw new Error();
        }
        if(this.size == 0){
            throw new Error();
        }
        for(int i = index;i <= this.size-2;i++){
            this.array[i]=this.array[i+1];
        }
        this.array[--this.size]=0;
    }
    private void ensureCapacity(){
        if(this.size <this.array.length){
            return;
        }
        //找新房子,找原来的两倍大
        int capacity=this.array.length*2;
        int[] newArray=new int[capacity];

        //搬家
        for(int i=0;i<this.size;i++){
            newArray [i]=this.array[i];
        }
        //去学校登记新房子,推掉老房子
        this.array=newArray;
    }

    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList(10);
        arrayList.pushBack(1);
        arrayList.pushBack(2);
        arrayList.pushBack(3);
        arrayList.pushFront(10);
        arrayList.pushFront(20);
        arrayList.pushFront(30);
        arrayList.add(100, 3);
        arrayList.add(200, 4);
        arrayList.add(300, 5);
        arrayList.add(300, 5);
        arrayList.add(300, 5);
        arrayList.popBack();
        arrayList.popBack();
        arrayList.popBack();
        arrayList.popFront();
        arrayList.popFront();
        arrayList.popFront();
        arrayList.remove(0);
        arrayList.remove(0);
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
