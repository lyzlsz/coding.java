package Thread;

import java.io.IOException;
import java.util.Scanner;

/**
 * Author:weiwei
 * description:列表补全
 * Creat:2019/3/5
 **/
public class Test0305 {
    public static String slice(int offset,int count,int a,int b){
        int startA = Math.min(a,Math.max(0,offset));
        int endA = Math.max(0,Math.min(a,offset+count));
        int startB = Math.min(b,Math.max(0,offset-a));
        int endB = Math.max(0,Math.min(b,offset+count-a));
        return startA + " "+endA+" "+startB +" "+endB;
    }

    public static void main(String[] args)throws IOException  {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            System.out.println(slice(input.nextInt(),input.nextInt(),input.nextInt(),
                    input.nextInt()));
        }
    }
}
