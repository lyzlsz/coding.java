package Test0804;

import javafx.util.Pair;

import java.util.Arrays;

/**
 * package:Test0804
 * Description:TODO
 *
 * @date:2019/8/4 0004
 * @Author:weiwei
 **/

public class createTree {
    class RV{
        Node node;
        int used;
    }
    static class Node{
        char value;
        Node left;
        Node right;
        Node root;

        public Node(char value){
            this.value = value;
            this.left = this.right = null;
        }
    }

    private static Pair<Node,Integer> createTree(char[] preOrder){
        if(preOrder.length == 0){
            return new Pair<>(null,0);
        }
        if(preOrder[0] == '#'){
            return new Pair<>(null,1);
        }
        Node root = new Node(preOrder[0]);
        Pair<Node,Integer> left =
                createTree(Arrays.copyOfRange(preOrder,1,preOrder.length));
        Pair<Node,Integer> right =
                createTree(Arrays.copyOfRange(preOrder,1+left.getValue(),preOrder.length));

        root.left = left.getKey();
        root.right = right.getKey();

        return new Pair<>(root,1+left.getValue()+right.getValue());
    }

    private static void preOrderTraversal(Node root){
        if(root != null){
            System.out.print(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    private static void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.value);
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        char[] preOrder = new char[]{
                'A','B','D','#','#','E','#','#','C','#','F'
        };
        Pair<Node,Integer>pair = createTree(preOrder);
        Node root = pair.getKey();
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
    }
}
