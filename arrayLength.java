package Test0724;


import java.util.Scanner;

/**
 * package:Test0724
 * Description:TODO
 * @date:2019/7/25
 * @Author:weiwei
 **/
public class arrayLength {
    public static int MoreThanHalfNum_Solution(int[] array){
        int count=0;
        int temp =0;
        if(array.length <= 0 || array == null){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        for(int i =0;i<array.length-1;i++){
            if(array[i] == array[i+1]){
                temp = array[i];
                count++;
            }
        }
        if(count >= array.length/2){
            return temp;
        }
        return count;
    }
    public static void main(String[] args) {
       int[] array = {1,2,3,2,2,6,8,4,9};
        MoreThanHalfNum_Solution(array);
    }
}
