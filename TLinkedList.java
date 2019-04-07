package com.bittech;

/**
 * Author:weiwei
 * description:LinkedList:
 * Creat:2019/4/7
 **/
public class TLinkedList {
    public class Node {
        public int value;  //保存的是有效数据
        public Node next;  //下一个节点引用


        Node(int v) {
            this.value = v;
            this.next = null;
        }
    }
    //如果一个节点都没有,head == null
    public Node head;   //保存在链表中第一个节点的引用

    TLinkedList(){
        head = null;
    }

    /**
     * 头插
     * @param node 已经new好的Node对象
     */

    void pushFront(Node node){
        node.next=this.head;
        this.head=node;
    }

    private Node getLast(){
        Node cur = this.head;
        while(cur.next != null){
            cur=cur.next;
        }
        return cur;
    }

    /**
     * 尾插
     * @param node 已经new 好的Node对象
     */

    void pushBack(Node node){
        if(this.head == null){
            this.head=node;
        }else{
            Node last = getLast();
            last.next=node;
        }
    }

    /**
     * 头删
     * @param node 已经new好的Node对象
     */
     void popFront(Node node){
         if(this.head == null){
             throw new Error();
         }
         this.head = this.head.next;
     }

     private Node getLastLast(){
         Node cur = this.head;
         while(cur.next.next != null){
             cur=cur.next;
         }
         return cur;
     }


    /**
     * 尾删
     * @param node 已经new好的Node对象
     */

    void popBack(Node node){
        if(this.head == null){
            throw new Error();
        }
        if(this.head.next == null){
            this.head = null;
        }else{
            Node lastLast = getLastLast();
            lastLast.next = null;
        }
    }

    public static void main(String[] args) {
        TLinkedList tLinkedList = new TLinkedList();
//        tLinkedList.pushBack( 1,);
//        tLinkedList.pushFront(12,);
//        tLinkedList.popFront(3,);
//        tLinkedList.popBack(4,);
    }
}
