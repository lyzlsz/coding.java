package Test0804;

import java.util.LinkedList;

/**
 * package:Test0804
 * Description:TODO
 *
 * @date:2019/8/4 0004
 * @Author:weiwei
 **/
public class isTree {
    static  class Node {
        char value;
        Node left;
        Node right;
        Node root;

        public Node(char value) {
            this.value = value;
        }
    }
    private static boolean isCompleteTree(Node root){
        if(root == null){
            return true;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        while(true){
            Node front = queue.pollFirst();
            if(front == null){
                //遇到空了,下一步去判断队列中剩余结点,是否全为空
                break;
            }
            queue.addLast(front.left);
            queue.addLast(front.right);
        }
        while(!queue.isEmpty()){
            Node front = queue.pollFirst();
            if(front != null){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        if(isCompleteTree(root)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
    }
}
