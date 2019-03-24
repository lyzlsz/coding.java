package Array;

import java.util.Arrays;

/**
 * Author:weiwei
 * description:数组拷贝
 * Creat:2019/3/22
 **/
public class Testcopyof {
    public static void main(String[] args) {
        int [] original = new int[] {1,3,5,7,9};
        int [] result = Arrays.copyOf(original,10);
        for(int temp : result){
            System.out.println(temp);
        }
    }
}
