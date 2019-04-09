package com.bittech;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/9
 **/
public class TestFindKthToTail {
    public class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode FindKthTail(ListNode head,int k){
        ListNode front = head;
        ListNode back = head;

        int i;
        for(i =0;front != null && i<k;i++){
            front=front.next;
        }
        if(front == null && i<k){
            //k大于节点个数
            return null;
        }else if(front == null){
            return head;
        }
        while(front != null){
            front = front.next;
            back = back.next;
        }
        return back;
    }
    public int length(ListNode head){
        int len =0;
        ListNode cur = head;
        while( cur != null){
            len++;
            cur=cur.next;
        }
        return len;
    }
}
