package BS;



import java.util.Random;

/**
 * package:BS
 * Description:TODO
 *
 * @date:2019/8/25 0025
 * @Author:weiwei
 **/
public class BSTree {
    private static class Node{
        int key;
        //int value;  //key-value模型

        Node left = null;
        Node right = null;

        Node(int key){
            this.key = key;
        }
    }
    Node root = null;


    /**
     *
     * @param node 要插入子树的根结点
     * @param key 要插入的值
     * @return 插入后二叉树的根结点
     */
   private Node insertInner(Node node,int key)throws Exception{
       if(node == null){
           return new Node(key);
       }

       if(key == node.key){
           throw new Exception("Key重复了");
       }

       if(key < node.key){
           node.left = insertInner(node.left,key);
       }else{
           node.right = insertInner(node.right,key);
       }
       return node;
   }
    public void insert(int key) throws Exception {
       root = insertInner(root,key);


    }

    /**
     *
     * @param node 待查找的二叉树的根结点
     * @param key 要找的值
     * @return 找到与否
     */
    private boolean containsInner(Node node,int key){
        if(node == null){
            return false;
        }

        if(node.key == key){
            return true;
        }
        if(key < node.key){
            return containsInner(node.left,key);
        }else{
            return containsInner(node.right,key);
        }
    }

    public boolean contains(int key){
        return containsInner(root,key);

    }
    public void remove(int key){
        throw new UnsupportedOperationException("了解理论即可");
    }

    public static void main(String[] args) {
        BSTree tree =new BSTree();
        Random random = new Random(20190825);
        for(int i =0;i<6;i++){
            try {
                tree.insert(random.nextInt(100));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello");
    }
}
