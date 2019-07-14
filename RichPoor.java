package Test;

/**
 * package:Test
 * Description:TODO
 * @date:2019/7/14
 * @Author:weiwei
 **/
public class RichPoor {
    public static void main(String [] args){
        long sumRich = 0;
        long sumPoor = 0;
        for(int i =0;i<=30;i++){
            sumRich += 10;
            sumPoor = sumPoor + (long)Math.pow(2,i-1);
        }
        System.out.println(sumRich+"万元   "+sumPoor+"分");
    }
}
