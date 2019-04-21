package Tree;


import java.util.ArrayList;
import java.util.List;

/**
 * Author:weiwei
 * description:给定一个二叉树,返回它的前序遍历
 * Creat:2019/4/19
 **/
public class Solution2 {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private ArrayList<Integer> list;
    private void preOrder(TreeNode root){
        if(root != null){
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root){
        list = new ArrayList<>();

        preOrder(root);
        return list;
    }
}
