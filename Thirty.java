package Test;

import java.util.Random;
import java.util.Scanner;

/**
 * Author:weiwei
 * description:抢三十
 * Creat:2019/2/22
 **/
public class Thirty {
    static Random r= new Random();
    static Scanner in=new Scanner(System.in);

    static int people(int t){      //人报数
        int a;
        do{                       //报的数
            System.out.printf("请报数: ");
            a=in.nextInt();       //从键盘接受报数
            if(a>2 || a<1 || t+a>30)
                System.out.printf("报数错误,请重新报数!\n");
            else
                System.out.printf("你的报数: %d \n",t+a);//报数有效,输出
        }while(a>2 || a<1 || t+a>30);                   //报数无效,重新输入
        return t+a;                                     //返回当前的已经取走的数累加和
    }
    static int computer(int s){   //计算机报数
        int c;
        System.out.printf("计算机的报数: ");
        if((s+1) %3 == 0){  //若剩余的数的模为1,则取1
            s++;
            System.out.printf(" %d \n",s);
        }
        else if((s+2) %3 ==0){  //r若剩余的数的模为2,则取2
            s+=2;
            System.out.printf("%d \n",s);
        }else{
            c=r.nextInt(2)+1;   //否则随机取1或2
            s+=c;        //控制范围
            System.out.printf( "%d \n",s);
        }
        return s;   //返回结果
    }

    public static void main(String[] args) {
        Random r=new Random();   //创建随机对象
        int tol=0;  //报数初始值为0
        System.out.printf("********抢三十************\n");
        System.out.printf("游戏开始\n");

        //取随机数决定机器人和谁先走一步
        if(r.nextInt(2) ==1)
            tol=people(tol);   //若为1,则人先走一步

        while(tol != 30){  //游戏结束条件
            tol=computer(tol);    //计算机报数
            if(tol == 30)  {       //计算机取一个数,若为30,则机器胜利
                System.out.printf("\n我输了!");
            break;  //退出游戏
        }

        tol=people(tol);   //人报数
        if(tol==30) {   //人取一个素,若为30,则人胜利
            System.out.printf("\n我赢了!");
            break;    //退出游戏
        }
    }
    System.out.printf("\n* * * * * * *游戏结束* * * * * *");
    }
}
