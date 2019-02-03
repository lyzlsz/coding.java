package interestingprogram;

/**
 * Author:weiwei
 * description:
 * Creat:${Date}
 **/
public class Ch1_2 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
