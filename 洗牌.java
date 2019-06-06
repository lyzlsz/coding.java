import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0;i < T;i++){
            int n =scanner.nextInt();
            int k =scanner.nextInt();
            int [] arr=new int[2*n];
            for(int j = 0;j < 2 * n;j++){
                arr[j] = scanner.nextInt();
            }
            for(int times = 0;times<k;times++){
                ShuffleOnce(arr,arr.length);
            }
            for(int a = 0;a <n * 2 - 1;a++){
                System.out.print(arr[a]+" ");
            }
            System.out.println(arr[n*2-1]);
        }
    }
    private static void ShuffleOnce(int[] arr,int n){
        ArrayList<Integer> list= new ArrayList<>(n);
        for(int i = 0;i< n / 2;i++){
            list.add(arr[i]);
            list.add(arr[i + n / 2]);
        }
        for(int i = 0;i < n;i++){
            arr[i] = list.get(i);
        }
    }
}