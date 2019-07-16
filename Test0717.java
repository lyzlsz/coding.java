package Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * package:Base
 * Description:TODO
 *
 * @date:2019/7/16 0016
 * @Author:weiwei
 **/
public class Main {
    public static boolean canForm(ArrayList<Integer> l){
        Collections.sort(l); //给l排序
        int sum = 0;
        for(int i =0;i<l.size()-1;i++){
            sum += l.get(i);
        }
        if(sum >l.get(l.size()-1)){
            return true;
        }
        return false;
    }
    public static void save(int[][] arr,int n){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =0;i<n;i++){
            //二维数组中的第一列存放的是对应操作,如果等于1,就加1根木棒否则就减一根
            if(arr[i][0] == 1){
                l.add(arr[i][1]);
            }else{
                l.remove(new Integer(arr[i][1]));
            }
            if(canForm((l))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for(int i =0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            save(arr,n);
        }
    }
}
