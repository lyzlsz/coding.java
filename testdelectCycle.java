package Test0728;

import Test0726.removeReapetList;

/**
 * package:Test0728
 * Description:找环形链表的入口点
 * @date:2019/7/28
 * @Author:weiwei
 **/
public class testdelectCycle {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode delectCycle(ListNode head){
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        do{
            fast = fast.next;
            if(fast != null){
                fast=fast.next;
                slow= slow.next;
            }
        }while (fast != null && fast != slow);
        if(fast == null){
            return null;
        }
        ListNode p1=head;
        ListNode p2=head;
        while (p1 != p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
