package Tree;

/**
 * Author:weiwei
 * description:对称二叉树
 * Creat:2019/4/19
 **/
public class IsSymmetric {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 镜像二叉树
     *
     * @param p
     * @param q
     * @return
     */
    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {//且
            return true;
        }
        if (p == null || q == null) {//或
            return false;
        }
        return p.val == q.val
                && isMirror(p.left, q.right)
                && isMirror(p.right, q.left);
    }

    private boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
}
