package com.bittech;

import javafx.scene.Node;

/**
 * Author:weiwei
 * description:删除链表中所有重复节点
 * Creat:2019/4/18
 **/

/**
 * 1.取两个引用,分别指向两个节点,比较两个节点的值
 * 相等
 *   第二个引用往后走,走到
 *      1.走到链表结束  2. 走到第一个不相等节点,尝试删除[第一个引用,第二个引用)的所有节点
 *  不相等
 *     因为链表是有序的,两个引用都往后走
 */

public class TestDeleteDuplicate {
    private static class Node{
        public int value;
        public Node next;

        Node(int v){
            this.value=v;
        }
    }
    private static class RNode{
        public int value;
        public RNode random;
        public RNode next;

        RNode(int v){
            this.value = v;
        }
    }
    private static Node deleteDuplicate(Node head){
        Node prev = null;
        Node p1 = head;
        Node p2 = head.next;

        while(p2 != null){
            if(p1.value != p2.value){
                prev=p1;
                p1=p1.next;
                p2=p2.next;
            }else{
                while(p2 != null && p2.value == p1.value){
                    p2=p2.next;
                }
                //[p1,p2)是重复的
                if(p1 == head){
                    head=p2;
                }else{
                    prev.next=p2;
                }
                p1=p2;
                if(p2 != null){
                    p2=p2.next;
                }
            }
        }
        return head;
    }

    private static void display(Node head){
        for(Node n =head;n != null;n=n.next){
            System.out.format("%d-->",n.value);
        }
        System.out.println("null");
    }
    private static void test1(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(5);
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next =n5;n5.next=null;
        display(n1);
        Node r = deleteDuplicate(n1);
        display(r);
    }
    public static void main(String[] args) {
        test1();
    }
}
