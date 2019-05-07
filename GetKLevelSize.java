package Reviews;

/**
 * Author:weiwei
 * description:
 * Creat:2019/5/7
 **/
public class GetKLevelSize {

    private static class Node{
        char value;
        Node left;
        Node right;

        Node(char v){
            this.value = v;
        }
    }
    private static int kLevel(Node root,int k){
        if(root == null){
            return 0;
        }else if(k == 1){
            return 1;
        }else{
            return kLevel(root.left,k-1) + kLevel(root.right,k - 1);
        }
    }
}
