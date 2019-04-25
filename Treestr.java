package Tree;

import javax.swing.tree.TreeNode;
import java.util.List;

/**
 * Author:weiwei
 * description:二叉树创建字符串
 * Creat:2019/4/25
 **/
public class Treestr {


    private static Node root;

    /**
     * 利用二叉树的前序遍历创建字符串
     * @param root
     * @param sb
     */
    private static void preOrderTreestr(Node root,StringBuilder sb){
        if(root != null){
            sb.append("(");
            sb.append(root.value);
            if(root.left == null && root.right != null){
                sb.append("()");
            }else{
                preOrderTreestr(root.left,sb);
            }
            preOrderTreestr(root.right,sb);
            sb.append(")");
        }
    }
    private static String treestr(Node root){
        if(root == null){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        preOrderTreestr(root,sb);
        sb.delete(0,1);
        sb.delete(sb.length()-1,sb.length());//一个删除第一个和最后一个字符

        return sb.toString();
    }

    public static void main(String[] args) {
        char [] preOrder = new char[]{
                'A','B','C','D','#','#','E','#','#','C','F'};
        String str = treestr(root);
        System.out.println(str);
    }
}
