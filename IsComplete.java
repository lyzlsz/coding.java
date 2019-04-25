package Tree2;

import java.util.LinkedList;

/**
 * Author:weiwei
 * description:判断是否是完全二叉树
 * Creat:2019/4/25
 **/
public class IsComplete {

    private static Node root;

    class Node{
        Node node;
        Node left;
        Node right;
    }
    private static boolean isComplete(Node root){
        if(root == null){
            return true;//空树 是完全二叉树
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        while(true){
            Node front =queue.pollFirst();
            if(front == null){
                break;//遇到空了,下一步去判断队列中剩余的结点,是否全为空
            }
            queue.addLast(front.left);
            queue.addLast(front.right);
        }
        //判断是否所有节点都是非空
        while(!queue.isEmpty()){
            Node front = queue.pollFirst();
            if(front != null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] preOrder = new char[]{
                'A','B','D','#','#','E','#','#','C','F'
        };
        if(isComplete(root)){
            System.out.println("是完全二叉树");
        }else{
            System.out.println("不是完全二叉树");
        }
    }
}
