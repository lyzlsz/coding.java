package com.bittech;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/14
 * @Author:weiwei
 **/
class TreeNode{
    TreeNode root;
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x){
        val =x;
    }
}
public class BalanceTree {
    public boolean isBalance(TreeNode root){
        if(root == null){
            return true;//空树即是一颗平衡二叉树
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left - right) <= 1 && isBalance(root.left) &&
                isBalance(root.right)){
            return true;
        }
        return false;
    }

    private int getHeight(TreeNode node) {
        if(node == null)
            return 0;
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        
    }
}
