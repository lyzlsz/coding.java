package com.bittech;

/**
 * Author:weiwei
 * description:反转一个单链表
 * Creat:2019/5/6
 **/
public class ReverseList {

    private static class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val = x;
        }
    }

    public static ListNode ReverseList(ListNode head){

        /**
         * 思路:存在链表 1 → 2 → 3 → Ø，我们想要把它改成 Ø ← 1 ← 2 ← 3。
         * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。
         * 由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。
         * 在更改引用之前，还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
         */

        ListNode prev  = null;  //前一个结点
        ListNode curr = head;   //当前结点
        while(curr != null){
            ListNode nextTemp = curr.next;  //指向下一个结点
            curr.next = prev;   //将当前结点的next域指向前一个结点
            prev = curr;   //prev向后移动
            prev = nextTemp;  //curr向后移动
        }
        return prev;
    }
}
