package com.bittech;

/**
 * Author:weiwei
 * description:合并两个有序链表
 * Creat:2019/4/8
 **/
public class TestMergeTwoList {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val=x;
        }
    }
    public ListNode megrTwoList(ListNode l1,ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode result =null;//结果链表的第一个节点
        ListNode last = null; //记录结果链表的最后一个节点

        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                //1.让cur1可以在运行后执行原cur1的下一个节点
                //2.让cur1尾插到[result,last]链表上
                //3.更新last
                ListNode next = cur1.next;

                //把cur1尾插到result上
                cur1.next = null;
                if(result == null){
                    result=cur1;
                }else{
                    //result链表中有节点
                    last.next=cur1;
                }
                last=cur1;
                cur1=next;
            }else{
                ListNode next = cur2.next;
                //把cur2尾插到result上
                cur2.next=null;
                if (result == null) {
                    result=cur2;
                }else{
                    //result链表有节点
                    last.next=cur2;
                }
                last=cur2;
                cur2=next;
            }
        }
        if(cur1 != null){
            last.next=cur1;
        }
        if(cur2 != null){
            last.next=cur2;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(6);

        n1.next = n2; n2.next = n3; n3.next = n4;
        n4.next = n5; n5.next = n6; n6.next = n7;
        n7.next = null;
    }
}
