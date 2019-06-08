package com.bittech;

import jdk.nashorn.api.tree.Tree;

/**
 * package:com.bittech
 * Description:TODO
 * @date:2019/6/8
 * @Author:weiwei
 **/
class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val){
        this.val = val;
    }
}
public class MirrorTree {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        TreeNode treeNode = root.left;
        root.left = root.right;
        root.right = root.left;

        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }
    public static void main(String[] args) {

    }
}
