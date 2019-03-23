package Array;

/**
 * Author:weiwei
 * description:数组排序
 * Creat:2019/3/22
 **/
public class Testsort {
    public static void main(String[] args) {
        int [] intData = new int[]{1,2,3,4,5};
        char [] charData = new char[]{'a','b','c','d','e'};
        java.util.Arrays.sort(intData);
        java.util.Arrays.sort(charData);
        printArray(intData);
        printArray(charData);
    }
    public static void printArray(int [] temp){
        for(int i = 0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println();
    }
    //方法重载
    public static void printArray(char [] temp){
        for(int i =0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println();
    }
}
