package List;

import jdk.nashorn.api.tree.Tree;

/**
 * package:List
 * Description:TODO
 * @date:2019/6/16
 * @Author:weiwei
 **/
public class Balance {
    class TreeNode{
        TreeNode root = null;
        TreeNode left = null;
        TreeNode right = null;
        int val;

        TreeNode(int x){
            x=this.val;
        }
    }
    public boolean isBalance(TreeNode root){
        //判断根是否为空
        if(root == null){
            return true;//空树即是一颗平衡二叉树
        }
        //获取左子树的高度
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);

        //左边子树高度大于1表示不是平衡二叉树
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        //检查是否平衡
        return isBalance(root.left) && isBalance(root.right);
    }

    private int getTreeHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left),getTreeHeight(root.right))+1;

    }
}
