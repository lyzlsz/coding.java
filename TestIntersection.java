package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/14
 **/

public class TestIntersection {
    private static class ListNode{
        int val;
        ListNode next;
    }
    private int getLength(ListNode head){
        int length =0;
        for(ListNode cur =head;cur != null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode getIntersection(ListNode headA,ListNode headB){
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        ListNode longer = headA;
        ListNode shorter = headB;
        int diff = lenA- lenB;
        if(lenA < lenB){
            diff=lenB-lenA;
            longer = headB;
            shorter = headA;
        }
        for(int i=0;i<diff;i++){
            longer = longer.next;
        }
        while (longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }

        return longer;
    }
}
