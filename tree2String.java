package Test0804;

/**
 * package:Test0804
 * Description:TODO
 *
 * @date:2019/8/4 0004
 * @Author:weiwei
 **/
public class tree2String {
    static class Node {
        char value;
        Node left;
        Node right;
        Node root;

        public Node(char value) {
            this.value = value;
        }
    }

    private static void preOrderTree2Str(Node root, StringBuilder sb) {
        if (root != null) {
            sb.append("(");
            if (root.left != null && root.right != null) {
                sb.append("()");
            } else {
                preOrderTree2Str(root.left, sb);
            }
            preOrderTree2Str(root.right, sb);
            sb.append(")");
        }
    }

    private static String tree2str(Node root) {
        if(root == null){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        preOrderTree2Str(root, sb);
        sb.delete(0, 1);
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    public static void main(String[] args) {
        char[] preOrder = new char[]{
                'A', 'B', 'D', '#', '#', 'E', '#', '#', 'C', '#', 'F'
        };
    }
}
