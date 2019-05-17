package List;

/**
 * package:List
 * Description:TODO
 *
 * @date:2019/5/16 0016
 * @Author:weiwei
 **/
public class BSTree {
    private static class Node{
        int key;//纯key模型
        Node left = null;
        Node right = null;

        Node(int key){
            this.key = key;
        }
    }
    Node root = null;

    /**
     * @param node 待插入子树的根节点
     * @param key 要插入的值
     * @return 插入后二叉树的根节点
     * @throws Exception
     */
    private Node insertInner(Node node,int key)throws Exception {
        if(root == null){
            return new Node(key);
        }
        if(key == node.key){
            throw new Exception("key重复了");
        }
        if(key < node.key){
            node.left=insertInner(node.left,key);
        }else{
            node.right=insertInner(node.right,key);
        }
        return node;
    }
    public void insert(int key)throw Exceotion{
        root = insertInner(root,key);
    }

    /**
     *
     * @param node 待查找的二叉树的根节点
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
        BSTree tree = new BSTree();
        Random random = new Random(20190516);
        for(int i =0;i<6;i++){
            try{
                tree.insert(random.nextInt(100));
            }catch(Exception e)
        }
        System.out.println("Hello");
    }
}
