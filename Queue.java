package com.bittech;

/**
 * Author:weiwei
 * description:链表类型的队列
 * Creat:2019/4/18
 **/
public class Queue {
    private class Node{
        int value;
        Node next;
    }

    Node head;
    Node last;

    Queue(){
        this.head=this.last = null;
    }

    /**
     * 把数据插到队尾
     * @param v
     */
    public void push(int v){
        Node node = new Node();
        node.value = v;
        node.next = null;
        if(this.head == null){
            this.head = this.last = node;
        }else{
            this.last.next = this.last = node;
        }
    }

    /**
     * 出队列
     * @return
     */
    public int pop(){
        int v=this.head.value;
        this.head =this.head.next;
        if(this.head == null){
            this.last = null;
        }
        return v;
    }

    /**
     * 返回队首元素
     * @return
     */
    public int front(){
        return this.head.value;
    }
    public int size(){
        return 0;
    }
    public boolean isEmpty(){
        return this.head == null;
    }
}
