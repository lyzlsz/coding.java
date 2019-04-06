package Sort;

        import java.util.Arrays;

/**
 * Author:weiwei
 * description:SelectionSort
 * Creat:2019/4/6
 **/
public class SelectionSort {
    public static int[] SelectionSort(int[] array){
        int len=array.length;
        int  minIndex,temp;

        for(int i=0;i<len-1;i++){
            minIndex=i;
            for(int j=i+1;j<len;j++){
                //寻找最小的数
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] in = {8,2,6,4,7,1,3,10,5};
        System.out.println(Arrays.toString(SelectionSort(in)));
    }
}
