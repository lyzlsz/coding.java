package Tree;



/**
 * Author:weiwei
 * description:二叉树前中后序遍历
 * Creat:2019/4/18
 **/
public class Main {
   private static class Node{
       char value;
       Node left;
       Node right;

       Node(char v){

           this.value=v;
       }
   }
   //当树为空,node=null

    /**
     * 前序遍历
     * @param root
     */

    private static void preOrderTraversal(Node root){
       if(root != null){
           //根 左子树的前序遍历 右子树的前序遍历
           System.out.print(root.value + " ");

           preOrderTraversal(root.left);
           preOrderTraversal(root.right);
       }
    }

    /**
     * 中序遍历
     * @param root
     */

    private static void inOrderTraversal(Node root){
        if(root != null){
            //左子树的中序遍历 根 右子树的中序遍历
            inOrderTraversal(root.left);
            System.out.print(root.value+" ");
            inOrderTraversal(root.right);
        }
    }

    /**
     * 后序遍历
     * @return
     */

    private static void postOrderTraversal(Node root){
        if(root != null){
            //左子树的后序遍历 右子树的后序遍历 根
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value +" ");
        }
    }
    private static Node createTreeTest(){
       Node a = new Node('A');
       Node b = new Node('B');
       Node c = new Node('C');
       Node d = new Node('D');
       Node e = new Node('E');
       Node f = new Node('F');
       Node g = new Node('G');
       Node h = new Node('H');

       a.left=b;a.right=c;
       b.left=d;b.right=e;
       e.right=h;c.left=f;
       c.right=g;

       return a;
    }

    /**
     * 求二叉树节点个数
     */
    private static int count=0;
    //用前序遍历求二叉树的节点个数
    private static void countByTraversal(Node root){
        if(root != null){
            count++;
            countByTraversal(root.left);
            countByTraversal(root.right);
        }
    }

    /**
     * 求二叉树叶子节点个数
     * @param root
     * @return
     */
    private static int leafCount(Node root){
        //叶子节点个数
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else{
            return leafCount(root.left)+leafCount(root.right);
        }
    }

    /**
     * 求二叉树的高度
     * @param root
     * @return
     */
    private static int height(Node root){
        //高度
        //空树
        //一个节点
        //其他  max(left,right)+1;
        if(root == null){
            return 0;
        }else{
            int left = height(root.left);
            int right = height(root.right);
            return (left>right ? left:right)+1;
        }
    }

    private static int count(Node root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            //可选
            return 1;
        }else{
            return count(root.left)+count(root.right)+1;
        }
    }

    /**
     * 求k层节点个数
     * @param root
     * @param k
     * @return
     */
    private static int kLevel(Node root,int k){
        if(root == null){
            return 0;
        }else if(k == 1){
            return 1;
        }else{
            return kLevel(root.left,k-1)+kLevel(root.right,k-1);
        }
    }

    /**
     * 在二叉树中查找元素
     * @param root
     * @param v
     * @return
     */
    private static Node find(Node root,char v){
        if(root == null){
            return null;
        }
        if(root.value == v){
            return root;
        }
        Node r = find(root.left,v);
        if(r != null){
            return r;
        }
        r=find(root.right,v);
        if(r != null){
            return r;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = createTreeTest();
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();

        System.out.println("二叉树高度:"+height(root));
    }
}
