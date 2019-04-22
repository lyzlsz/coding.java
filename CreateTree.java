package Tree;


import java.util.Arrays;

/**
 * Author:weiwei
 * description:利用带空节点的前序遍历创建二叉树
 * Creat:2019/4/18
 **/
class Node {
    public char value;
    public Node left;
    public Node right;

    Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

    class CreateTreeReturnValue {
        /**
         * 创建号二叉树的根结点
         */
        public Node returnRoot;

        /**
         * 使用个数
         */
        public int used;

        CreateTreeReturnValue(Node returnRoot, int used) {
            this.returnRoot = returnRoot;
            this.used = used;
        }
    }
public class CreateTree{

    private static CreateTreeReturnValue createTree (char[] preOrder) {
        if (preOrder.length == 0) {
            return new CreateTreeReturnValue(null, 0);
        }
        char rootValue = preOrder[0];//根的位置
        if (rootValue == '#') {
            return new CreateTreeReturnValue(null, 1);
        }
        //根结点
        Node root = new Node(rootValue);//拿根的值取创建根节点

        //左子树,利用递归
        char[] leftPreOrder = new char[preOrder.length - 1];
        leftPreOrder = Arrays.copyOfRange(preOrder, 0, preOrder.length);
        CreateTreeReturnValue leftReturn =
                createTree(leftPreOrder);


        //右子树,利用递归
        //Length - 根的长度 - 右子树的长度
        //Length - 1- leftRetrun.used
        char[] rightPreOrder = new char[preOrder.length - 1 - leftReturn.used];
        rightPreOrder = Arrays.copyOfRange(preOrder, 1 + leftReturn.used, preOrder.length);
        CreateTreeReturnValue rightReturn =
                createTree(rightPreOrder);

        //绑定左右子树的根
        root.left = leftReturn.returnRoot;
        root.right = rightReturn.returnRoot;

        //创建好的树的根结点是root
        //使用个数是
        //    根的使用个数(1)
        //   +左子树的使用个数(leftReturn.used)
        //   +右子树的使用个数(rightReturn.used)
        return new CreateTreeReturnValue(
                root, 1 + leftReturn.used + rightReturn.used
        );
    }

    public static void main(String[] args) {
        char[] preOrder = new char[]{
                'A','B','C','D','E'
        };
    }
}





























/**
 * 1.preOrder[0] 位置就是根的位置,拿根的值创建根节点
 * char
 * 2.利用preOrder,找到左子树前序遍历数组,去掉第一个值(数组拷贝)
 * 3.递归调用,返回两个值,创建的左子树,左使用的个数
 * 4.利用preOrder,找到右子树的前序遍历数组,去掉第一个值,去掉左用的值
 * 5.递归调用返回两个值,创建的右子树,右使用的个数
 * 6.把根,左子树,右子树关联在一起
 * 7.返回
 *   创建好的树 root
 *   使用的个数 根+左+右
 * 终止条件:
 *    if(preOrder.length==0){
 *
 *    }
 *
 *
 *    else if{
 *        preOrder[0] == '#';
 *    }else{
 *        7步
 *    }
 *
 *
 *
 *
 **/