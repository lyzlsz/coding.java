package com.bittech;

/**
 * Author:weiwei
 * description:以给定值x为基准将链表分割成两部分
 * Creat:2019/4/9
 **/
public class TestPartitionList {
    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode partitionList(ListNode pHead,int x){
        ListNode small = null;//小于x
        ListNode smallLast = null;//小于x的最后一个节点
        ListNode big = null;//大于x
        ListNode bigLast = null;//大于x的最后一个节点

        ListNode cur = pHead;
        while(cur != null){
            ListNode next = cur.next;
            //小于x,尾插到small链表中,大于等于尾插到big链表中
            if(cur.val < x){
                //尾插
                if(small == null){
                    small=cur;
                }else{
                    smallLast.next=cur;//最后一个节点的下一个节点为cur
                }
                //更新链表的最后一个节点
                smallLast = cur;
            }else{
                //把cur尾插到big链表上
                if(big == null){
                    big = cur;
                }else{
                    bigLast.next=cur;
                }
                //更新链表的最后一个节点
                bigLast = cur;
            }
            cur = next;
        }
        //[small,smallLast]
        //[big,bigLast]
        //需要考虑其中有链表为空的情况
        if(small == null){
            return big;
        }else{
            smallLast.next=big;
            return small;
        }
    }
}

