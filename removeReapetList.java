package Test0726;

/**
 * package:Test0726
 * Description:TODO
 *
 * @date:2019/7/27 0027
 * @Author:weiwei
 **/
public class removeReapetList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeReapetList(ListNode head){
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(0);//假结点,引用时钟指向第一个结点,让第一个结点有前驱
        dummy.next=head; //消除第一个结点没有前驱的特殊性
        ListNode prev = dummy;  //prev永远是p1的前驱结点,用来删除结点
        //p1和p2是进行比较的两个结点
        ListNode p1=head;
        ListNode p2=head.next;

        while(p2 != null){
            if(p1.val != p2.val){
                //因为有序,p1和p2不等,和p2的next更不会相等
                prev = prev.next;
                p1=p1.next;
                p2=p2.next;
            }else{
                while(p2 != null && p2.val == p1.val){
                    p2=p2.next;
                }
                prev.next=p2;
                p1=p2;
                if(p2 != null){
                    p2=p2.next;
                }
            }
        }
        return dummy.next;
    }
}
