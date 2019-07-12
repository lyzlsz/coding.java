package Test;

import java.util.Scanner;

/**
 * package:Test
 * Description:TODO
 * @date:2019/7/12
 * @Author:weiwei
 **/
public class SphericalRadius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String []c = s.split(" ");
            double []b = new double[6];
            for(int i = 0;i< 6;i++){
                b[i]=Double.parseDouble(c[i]);
            }
            double r = Math.pow(Math.pow((b[3]-b[0]),2)+
                    Math.pow((b[4]-b[1]),2)+Math.pow((b[5]-b[2]),2),0.5);
            System.out.printf("%.3f %.3f\n",r,4*Math.acos(-1)*r*r*r/3);
        }
    }
}
