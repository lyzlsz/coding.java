package Test0728;

/**
 * package:Test0728
 * Description:TODO
 *
 * @date:2019/7/28 0028
 * @Author:weiwei
 **/
public class testcopyList {

    public class ListNode {

        int val;
        ListNode next;
        ListNode random;

        ListNode(int val) {

            this.val = val;
        }
    }

    public ListNode copyList(ListNode head) {
        //普通链表复制
        ListNode cur = head;
        ListNode result = null;
        ListNode last = null;
        while (cur != null) {
            ListNode newNode = new ListNode(cur.val);

            if (result == null) {
                result = newNode;
            } else {
                last.next = newNode;
            }
            last = newNode;
            cur = cur.next;
        }
        last.next = null;
        return result;
    }

    public ListNode copyRandomList(ListNode head) {
        //思路:
        //    //1.遍历原链表的每一个结点,复制信结点,插大原链表的后边
        //    //2.遍历原链表的=每一个结点,进行新结点random的设置
        //    //cur.next.random = cur.random.next
        //    //3.把一条链表拆分原链表和新链表

        ListNode cur = head;
        while (cur != null) {
            ListNode newNode = new ListNode(cur.val);

            //把newNode插入到cur放入后边
            newNode.next = cur.next;
            cur.next = newNode;

            //让cur走向下一个原链表的结点
            cur = cur.next.next;

        }
        //设置新节点的random
        cur = head;
        while (cur != null) {
            ListNode newNode = cur.next;
            if (cur.random == null) {
                newNode.random = null;
            } else {
                newNode.random = cur.random.next;
            }

            //cur走到下一个结点
            cur = cur.next.next;
        }
        //拆
        cur = head;
        ListNode result = head.next;
        while (cur != null) {
            ListNode newNode = cur.next;
            cur.next = newNode.next;
            if (newNode.next == null) {
                newNode.next = newNode.next.next;
            }
            cur = cur.next;
        }
        return result;
    }
}
