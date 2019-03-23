package Array;


/**
 * Author:weiwei
 * description:数组拷贝
 * Creat:2019/3/22
 **/
public class Testcopy {
    public static void main(String[] args) {
        int [] dataA = new int []{1,2,3,4,5,6,7,8,9};
        int [] dataB = new int []{11,22,33,44,55,66,77,88,99};
        System.arraycopy(dataB,3,dataA,2,4);
        printArray(dataA);
    }
    public static void printArray(int[] temp){
        for(int i =0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println();
    }
}
