package Test0726;

/**
 * package:Test0726
 * Description:合并两个有序链表
 * @date:2019/7/26
 * @Author:weiwei
 **/
//public class mergeTwoLists {
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            this.val = x;
//        }
//    }
//    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
//        if(l1 == null){
//            return l2;
//        }
//        if(l2 == null){
//            return l1;
//        }
//        ListNode cur1 = l1;
//        ListNode cur2 = l2;
//        ListNode result = null;
//        ListNode last = null;//记录结果链表的最后一个结点
//
//        while(cur1 != null && cur2 != null){
//            if(cur1.val <= cur2.val){
//                //1.让cur1可以在运行后执行原cur1的下一个结点
//                //2.让cur1尾插到[result,last]链表上
//                //3.更新last
//                ListNode next = cur1.next;
//
//                //把cur1尾插到result上
//                cur1.next=null;
//                if(result == null){
//                    result = cur1;
//                }else{
//                    last.next=cur1;
//                }
//                last=cur1;  //更新最后一个结点记录
//                cur1=next; //循环往后走
//            }
//            else {
//                ListNode next = cur2.next;
//                //把cur2尾插到result上
//                cur2.next = null;
//                if (result == null) {
//                    result = cur2;
//                } else {
//                    last.next = cur2;
//                }
//                last = cur2;
//                cur2 = next;
//            }
//        }
//        if(cur1 != null){
//            last.next=cur1;
//        }
//        if(cur2 != null){
//            last.next=cur2;
//        }
//        return result;
//    }
//}
