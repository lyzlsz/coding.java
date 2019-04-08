package com.bittech;

/**
 * Author:weiwei
 * description:删除链表中给定的值
 * Creat:2019/4/8
 **/
public class TestRemoveList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode result = null;//结果链表置为空
            ListNode last = null;//记录结果链表的最后一个节点

            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                if (cur.val != val) {
                    //把cur的节点尾插到result链表上

                    //尾插
                    cur.next = null;
                    if (result == null) {
                        result = cur;
                    } else {
                        last.next = cur;
                    }
                    //尾插结束

                    //更新链表的最后一个节点
                    last = cur;
                }
                cur = next;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        Solution solution = new Solution();
        ListNode result = solution.removeElements(n1, 6);
        ListNode cur = result;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}

