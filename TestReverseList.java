package com.bittech;


/**
 * Author:weiwei
 * description:反转一个单链表
 * Creat:2019/4/7
 **/
public class TestReverseList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    public ListNode reverseList(ListNode head){
        ListNode result =null;//结果链表
        ListNode cur = head;

        while(cur != null){
            ListNode next=cur.next;

            //头插到结果链表
            cur.next = result;
            result = cur;

            cur=next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        TestReverseList testReverseList = new TestReverseList();
        testReverseList.reverseList(n1);
        System.out.println(n1);
    }
}
