package Tree;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:
 * Creat:2019/4/23
 **/
public class BuildTree2 {

    /**
     * 在二叉树中找到给定的元素
     * @param root 根结点
     * @return  null没找到,非null表示结点引用
     */
    private static Node find(Node root,char v){
        //空树的判断
        if(root == null){
            return null;
        }
        //比较根结点的值
        if(root.value == v){
            return root;
        }

        //根结点不是要找的值
        //去左子树中查找
        Node left = find(root.left,v);
        if(left != null){
            return left;//返回左子树中找到结点的引用
        }

        //左子树中没有找到
        //去右子树中找
         return find(root.right,v);
    }

    /**
     * 根据中序遍历和后序遍历创建二叉树
     * @param inorder
     * @param postorder
     * @return
     */

     private static Node BuildTree2(char[] postorder,char[] inorder ){
        if(inorder.length == 0){
            return null;
        }

        //根据后序遍历,找到根的值,并且创建根结点
         char rootValue =postorder[0];//根结点的位置
         Node root = new Node(rootValue);

         //在中序中找到根的位置,并且切分左右子树的中序和后序
         int leftSize = find(inorder, rootValue);

         //切出左子树的中序和后序
         char[] leftInorder = Arrays.copyOfRange(inorder,0,leftSize);
         char[] leftPostorder = Arrays.copyOfRange(postorder,0,leftSize);

         root.left = BuildTree2(leftInorder,leftPostorder);

         //切出右子树的中序和后序
         char[] rightInorder = Arrays.copyOfRange(inorder,leftSize+1,inorder.length);
         char[] rightPostorder = Arrays.copyOfRange(postorder,leftSize,postorder.length-1);

         root.right = BuildTree2(rightInorder,rightPostorder);

         return root;

    }

    public static void main(String[] args) {
        char[] inorder = new char[]{
                'C','D','B','A','E'
        };
        char[] postorder = new char[]{
                'D','C','B','E','A'
        };

        Node root = BuildTree2(inorder,postorder);

        find(root,'E');
    }
}
