package Test0728;

import Test0726.removeReapetList;

/**
 * package:Test0728
 * Description:判断两个链表是否交叉
 * @date:2019/7/28
 * @Author:weiwei
 **/
public class testIsCross {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }

    private int getLength(ListNode head){
        int length=0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            length++;
        }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        ListNode longer = headA;
        ListNode shorter = headB;
        int diff = lenA-lenB;
        if(lenA < lenB){
            diff = lenB-lenA;
            longer = headA;
            shorter = headB;
        }
        for(int i =0;i<diff;i++){
            longer=longer.next;
        }
        while (longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }
}
