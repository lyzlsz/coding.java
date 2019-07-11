package com.bittech;

import java.util.Scanner;

/**
 * package:com.bittech
 * Description:TODO
 *
 * @date:2019/7/11 0011
 * @Author:weiwei
 **/
public class CBJ {
    public static void main(String[] args) {
        int i,j;
        int [] onewinkind = new int[3];
        int [] twowinkind = new int[3];
        int onewin = 0;
        int twowin = 0;
        int pingju = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char [][] data = new char[N][2];
        for(i =0;i<N;i++){
            for(j =0;j<2;j++){
                data[i][j] = sc.next().charAt(0);
            }
        }
        for(i =0;i<N;i++){
            switch (data[i][0]){
                case 'C':
                    if(data[i][1] == 'J'){
                        onewinkind[0]++;
                    }else if(data[i][1] == 'B'){
                        twowinkind[2]++;
                    }
                    break;
                case 'J':
                    if(data[i][1] == 'B'){
                        onewinkind[1]++;
                    }else if(data[i][1] == 'C'){
                        twowinkind[0]++;
                    }
                    break;
                case 'B':
                    if(data[i][1] == 'C'){
                        onewinkind[2]++;
                    }else if(data[i][1] == 'J'){
                        twowinkind[1]++;
                    }
                    break;
            }
        }
        onewin = onewinkind[0] + onewinkind[1] + onewinkind[2];
        twowin = twowinkind[0] + twowinkind[1] + twowinkind[2];
        pingju = N - onewin - twowin;
        System.out.println(onewin + " " + pingju + " " + twowin);
        System.out.println(twowin + " " + pingju + " " + onewin);
        System.out.println(show(onewinkind[0],onewinkind[1],onewinkind[2])+
         " " + show(twowinkind[0],twowinkind[1],twowinkind[2]));
    }
    public static char show (int C,int J,int B){
        return (C >= J)?(C > B) ? 'C' : 'B' :(J > B) ? 'J' : 'B';
     }
}
