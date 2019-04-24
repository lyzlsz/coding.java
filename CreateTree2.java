package Tree;

import javafx.util.Pair;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/24
 **/
public class CreateTree2 {
    static class Node{
        char value;
        Node left;
        Node right;

        public Node(char value){
            this.value=value;
            this.left=this.right=null;
        }
    }

    private static Pair<Node,Integer> createTree2(char[] preOrder){
        if(preOrder.length == 0){
            return new Pair<>(null,0);
        }

        if(preOrder[0] =='#'){
            return new Pair<>(null,1);
        }

        Node root = new Node(preOrder[0]);//根的位置
        Pair<Node,Integer> left = createTree2(Arrays.copyOfRange(preOrder,
                1,preOrder.length));
        Pair<Node,Integer> right = createTree2(Arrays.copyOfRange(preOrder,
                1+left.getValue(),preOrder.length));

        root.left = left.getKey();
        root.right= right.getKey();

        return new Pair<>(
                root,
                1+left.getValue()+right.getValue()
        );
    }

        private static void preOrderTraversal(Node root) {
            if (root != null) {
                System.out.println(root.value);
                preOrderTraversal(root.left);
                preOrderTraversal(root.right);
            }
        }

            private static void inOrderTraversal (Node root){
                if (root != null) {
                    inOrderTraversal(root.left);
                    System.out.println(root.value);
                    inOrderTraversal(root.right);
                }
            }

        public static void main(String [] args){
            char[] preOrder = new char[]{
                    'A','B','C','D','E','F'
            };
            char[] inOrder = new char[]{
                    'E','C','B','A','F','D'
            };
    }
}

