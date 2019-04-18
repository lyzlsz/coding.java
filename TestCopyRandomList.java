package com.bittech;

/**
 * Author:weiwei
 * description:复制链表
 * Creat:2019/4/18
 **/
public class TestCopyRandomList {
    private static class Node {
        public int value;
        public Node next;

        Node(int v) {
            this.value = v;
        }
    }

    private static class RNode {
        public int value;
        public RNode random;
        public RNode next;

        RNode(int v) {
            this.value = v;
        }
    }

    private static RNode copyRandomList(RNode head) {
        if (head == null) {
            return null;
        }


        /**
         * 1.创建新节点,插到老节点后面
         * 2.设置random
         * 3.拆开
         */
        RNode cur = head;
        while (cur != null) {
            RNode n = new RNode(cur.value);
            n.next = cur.next;
            cur.next = n;
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            } else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }

        cur = head;
        RNode rhead = head.next;
        while (cur != null) {
            RNode n = cur.next;
            cur.next = n.next;
            if (n.next != null) {
                n.next = n.next.next;
            }
            cur = cur.next;
        }
        return rhead;
    }

    private static void test2() {
        RNode n1 = new RNode(1);
        RNode n2 = new RNode(2);
        RNode n3 = new RNode(3);
        RNode n4 = new RNode(4);
        RNode n5 = new RNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        n1.random = n2;
        n2.random = n4;
        n3.random = n1;
        n4.random = n2;
        n5.random = null;

        RNode rn1 = copyRandomList(n1);
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        test2();
    }
}
