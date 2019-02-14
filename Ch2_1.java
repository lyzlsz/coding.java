package interestingprogram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Author:weiwei
 * description:黑色星期五
 * Creat:2019/2/14
 **/
public class Ch2_1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入起始年份: ");
        int year=input.nextInt();
        System.out.println("请输入打算输出未来几年: ");
        int n=input.nextInt();
        getBlackFri(year,n);
    }
    public static void getBlackFri(int year,int n){
        SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd E");
        int k=0;
        Calendar cal=Calendar.getInstance();
        while(k<n){
            for(int i=0;i<12;i++){
                cal.set(year,i,13);
                if(5==(cal.get(Calendar.DAY_OF_WEEK)-1));{
                    System.out.println("黑色星期五:"+sdf.format(cal.getTime()));
                }
            }
            year++;
            k++;
        }
    }
}
