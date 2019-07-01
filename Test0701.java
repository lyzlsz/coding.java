package List;

import java.util.Scanner;

/**
 * package:List
 * Description:TODO
 * @date:2019/6/16
 * @Author:weiwei
 **/
public class Test0616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[] =new  int[N];//n个整数
        //flag:A2中用到的功能+-
        //conut:A4中计数
        int A1=0,A2=0,A3=0,A4=0,A5=0,flag =1,count=0;

        for(int i =0;i<N;i++){
            num[i] = sc.nextInt();
            //A1
            if(num[i] % 5 == 0){
                if(num[i] % 2 == 0)
                    A1=A1+num[i];
            }
            //A2
            if(num[i] % 5 == 1){
                A2=A2+flag*num[i];
                flag = -flag;
            }
            //A3
            if(num[i] % 5 == 2){
                A3++;
            }
            //A4
            if(num[i] % 5 == 3){
                A4=A4+num[i];
                count++;
            }
            //A5
            if(num[i] % 5 == 4){
                if(num[i] > A5)
                    A5=num[i];
            }
        }
        if(A1 != 0){
            System.out.print(A1+" ");
        }else{
            System.out.print("N"+" ");
        }
        if(A2 != 0){
            System.out.print(A2+" ");
        }else{
            System.out.print("N"+" ");
        }
        if(A3 != 0){
            System.out.print(A3+" ");
        }else{
            System.out.print("N"+" ");
        }
        if(A4 != 0){
            System.out.print(A4/count+"."+(int)((A4%count*100/count+5)/10)+" ");
        }else{
            System.out.print("N"+" ");
        }
        if(A5 != 0){
            System.out.print(A5);
        }else{
            System.out.print("N");
        }
    }
}
