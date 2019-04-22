package Tree;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/22
 **/

import java.util.Arrays;

/**
 * 根据前序和中序遍历创建二叉树
 */
public class BuildTree {
    
    private static int find(char[] array, char v) {
        if(int i = 0;i<array;i++){
            if(array[i] == v){
                return i;
            }
        }
        return -1;
    }

    private static Node buildTree(char[] preorder,char[] inorder){
        if(preorder.length == 0){
            return null;
        }
        //根据前序,找到根的值,并且创建根结点
        char rootValue =preorder[0];//根的位置
        Node root = new Node(rootValue);

        //在中序中找到根的位置的下标
        int leftSize = find(inorder,rootValue);

        //切出左子树的前序 和 中序
        char[] leftPreorder = Arrays.copyOfRange(preorder,1,1+leftSize);
        char[] leftInorder = Arrays.copyOfRange(preorder,0,leftSize);

        root.left = buildTree(leftPreorder,leftInorder);

        //切出右子树的前序和中序
        char[] rightPreorder = Arrays.copyOfRange(preorder,1+leftSize,preorder.length);
        char[] rightInorder = Arrays.copyOfRange(preorder,leftSize+1,preorder.length);

        root.right = buildTree(rightPreorder,rightInorder);

        return root;

    }

    public static void main(String[] args) {
        char[] preorder = new char[]{
                'A','B','C','D','E'
        };
        char[] inorder = new char[]{
                'C','D','B','A','E'
        };

        Node root = buildTree(preorder,inorder);
    }
}
